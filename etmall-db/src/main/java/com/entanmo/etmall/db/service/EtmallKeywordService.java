package com.entanmo.etmall.db.service;

import com.entanmo.etmall.db.dao.EtmallKeywordMapper;
import com.entanmo.etmall.db.domain.EtmallKeyword;
import com.entanmo.etmall.db.domain.EtmallKeywordExample;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EtmallKeywordService {

    @Resource
    private EtmallKeywordMapper keywordsMapper;

    public EtmallKeyword queryDefault() {
        EtmallKeywordExample example = new EtmallKeywordExample();
        example.or().andIsDefaultEqualTo(true).andDeletedEqualTo(false);
        return keywordsMapper.selectOneByExample(example);
    }

    public List<EtmallKeyword> queryHots() {
        EtmallKeywordExample example = new EtmallKeywordExample();
        example.or().andIsHotEqualTo(true).andDeletedEqualTo(false);
        return keywordsMapper.selectByExample(example);
    }

    public List<EtmallKeyword> queryByKeyword(String keyword, Integer page, Integer limit) {
        EtmallKeywordExample example = new EtmallKeywordExample();
        example.setDistinct(true);
        example.or().andKeywordLike("%" + keyword + "%").andDeletedEqualTo(false);
        PageHelper.startPage(page, limit);
        return keywordsMapper.selectByExampleSelective(example, EtmallKeyword.Column.keyword);
    }

    public List<EtmallKeyword> querySelective(String keyword, String url, Integer page, Integer limit, String sort, String order) {
        EtmallKeywordExample example = new EtmallKeywordExample();
        EtmallKeywordExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(keyword)) {
            criteria.andKeywordLike("%" + keyword + "%");
        }
        if (!StringUtils.isEmpty(url)) {
            criteria.andUrlLike("%" + url + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return keywordsMapper.selectByExample(example);
    }

    public void add(EtmallKeyword keywords) {
        keywords.setAddTime(LocalDateTime.now());
        keywords.setUpdateTime(LocalDateTime.now());
        keywordsMapper.insertSelective(keywords);
    }

    public EtmallKeyword findById(Integer id) {
        return keywordsMapper.selectByPrimaryKey(id);
    }

    public int updateById(EtmallKeyword keywords) {
        keywords.setUpdateTime(LocalDateTime.now());
        return keywordsMapper.updateByPrimaryKeySelective(keywords);
    }

    public void deleteById(Integer id) {
        keywordsMapper.logicalDeleteByPrimaryKey(id);
    }
}
