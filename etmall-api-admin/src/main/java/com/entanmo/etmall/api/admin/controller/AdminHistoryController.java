package com.entanmo.etmall.api.admin.controller;

import com.entanmo.etmall.api.admin.annotation.RequiresPermissionsDesc;
import com.entanmo.etmall.core.util.ResponseUtil;
import com.entanmo.etmall.core.validator.Order;
import com.entanmo.etmall.core.validator.Sort;
import com.entanmo.etmall.db.domain.EtmallSearchHistory;
import com.entanmo.etmall.db.service.EtmallSearchHistoryService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/history")
public class AdminHistoryController {

    @Autowired
    private EtmallSearchHistoryService searchHistoryService;

    @RequiresPermissions("admin:history:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "搜索历史"}, button = "查询")
    @GetMapping("/list")
    public Object list(String userId, String keyword,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "add_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        List<EtmallSearchHistory> historyList = searchHistoryService.querySelective(userId, keyword, page, limit,
                sort, order);
        return ResponseUtil.okList(historyList);
    }
}
