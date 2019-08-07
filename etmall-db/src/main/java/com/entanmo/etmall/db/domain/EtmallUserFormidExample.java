package com.entanmo.etmall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EtmallUserFormidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EtmallUserFormidExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public EtmallUserFormidExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public EtmallUserFormidExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        EtmallUserFormidExample example = new EtmallUserFormidExample();
        return example.createCriteria();
    }

    public EtmallUserFormidExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public EtmallUserFormidExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFormidIsNull() {
            addCriterion("formId is null");
            return (Criteria) this;
        }

        public Criteria andFormidIsNotNull() {
            addCriterion("formId is not null");
            return (Criteria) this;
        }

        public Criteria andFormidEqualTo(String value) {
            addCriterion("formId =", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("formId = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFormidNotEqualTo(String value) {
            addCriterion("formId <>", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("formId <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThan(String value) {
            addCriterion("formId >", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("formId > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThanOrEqualTo(String value) {
            addCriterion("formId >=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("formId >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFormidLessThan(String value) {
            addCriterion("formId <", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("formId < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFormidLessThanOrEqualTo(String value) {
            addCriterion("formId <=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("formId <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andFormidLike(String value) {
            addCriterion("formId like", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotLike(String value) {
            addCriterion("formId not like", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidIn(List<String> values) {
            addCriterion("formId in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotIn(List<String> values) {
            addCriterion("formId not in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidBetween(String value1, String value2) {
            addCriterion("formId between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotBetween(String value1, String value2) {
            addCriterion("formId not between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andIsprepayIsNull() {
            addCriterion("isprepay is null");
            return (Criteria) this;
        }

        public Criteria andIsprepayIsNotNull() {
            addCriterion("isprepay is not null");
            return (Criteria) this;
        }

        public Criteria andIsprepayEqualTo(Boolean value) {
            addCriterion("isprepay =", value, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("isprepay = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsprepayNotEqualTo(Boolean value) {
            addCriterion("isprepay <>", value, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("isprepay <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsprepayGreaterThan(Boolean value) {
            addCriterion("isprepay >", value, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("isprepay > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsprepayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isprepay >=", value, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("isprepay >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsprepayLessThan(Boolean value) {
            addCriterion("isprepay <", value, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("isprepay < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsprepayLessThanOrEqualTo(Boolean value) {
            addCriterion("isprepay <=", value, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("isprepay <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIsprepayIn(List<Boolean> values) {
            addCriterion("isprepay in", values, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayNotIn(List<Boolean> values) {
            addCriterion("isprepay not in", values, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayBetween(Boolean value1, Boolean value2) {
            addCriterion("isprepay between", value1, value2, "isprepay");
            return (Criteria) this;
        }

        public Criteria andIsprepayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isprepay not between", value1, value2, "isprepay");
            return (Criteria) this;
        }

        public Criteria andUseamountIsNull() {
            addCriterion("useAmount is null");
            return (Criteria) this;
        }

        public Criteria andUseamountIsNotNull() {
            addCriterion("useAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUseamountEqualTo(Integer value) {
            addCriterion("useAmount =", value, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("useAmount = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUseamountNotEqualTo(Integer value) {
            addCriterion("useAmount <>", value, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("useAmount <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUseamountGreaterThan(Integer value) {
            addCriterion("useAmount >", value, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("useAmount > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUseamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("useAmount >=", value, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("useAmount >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUseamountLessThan(Integer value) {
            addCriterion("useAmount <", value, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("useAmount < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUseamountLessThanOrEqualTo(Integer value) {
            addCriterion("useAmount <=", value, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("useAmount <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUseamountIn(List<Integer> values) {
            addCriterion("useAmount in", values, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountNotIn(List<Integer> values) {
            addCriterion("useAmount not in", values, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountBetween(Integer value1, Integer value2) {
            addCriterion("useAmount between", value1, value2, "useamount");
            return (Criteria) this;
        }

        public Criteria andUseamountNotBetween(Integer value1, Integer value2) {
            addCriterion("useAmount not between", value1, value2, "useamount");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(LocalDateTime value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("expire_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(LocalDateTime value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("expire_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(LocalDateTime value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("expire_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("expire_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(LocalDateTime value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("expire_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("expire_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<LocalDateTime> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<LocalDateTime> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openId is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openId is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openId =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("openId = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openId <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("openId <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openId >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("openId > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openId >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("openId >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openId <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("openId < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openId <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("openId <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openId like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openId not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openId in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openId not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openId between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openId not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(LocalDateTime value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(LocalDateTime value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(LocalDateTime value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("add_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<LocalDateTime> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<LocalDateTime> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualToColumn(EtmallUserFormid.Column column) {
            addCriterion(new StringBuilder("deleted <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private EtmallUserFormidExample example;

        protected Criteria(EtmallUserFormidExample example) {
            super();
            this.example = example;
        }

        public EtmallUserFormidExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andDeletedEqualTo(EtmallUserFormid.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(EtmallUserFormid.Deleted.IS_DELETED.value());
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(com.entanmo.etmall.db.domain.EtmallUserFormidExample example);
    }
}