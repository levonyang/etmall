package com.entanmo.etmall.core.service;

import com.entanmo.etmall.db.constant.CouponConstant;
import com.entanmo.etmall.db.domain.EtmallCoupon;
import com.entanmo.etmall.db.domain.EtmallCouponUser;
import com.entanmo.etmall.db.service.EtmallCouponService;
import com.entanmo.etmall.db.service.EtmallCouponUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class CouponVerifyService {

    @Autowired
    private EtmallCouponUserService couponUserService;
    @Autowired
    private EtmallCouponService couponService;

    /**
     * 检测优惠券是否适合
     */
    public EtmallCoupon checkCoupon(Integer userId, Integer couponId, BigDecimal checkedGoodsPrice) {
        EtmallCoupon coupon = couponService.findById(couponId);
        EtmallCouponUser couponUser = couponUserService.queryOne(userId, couponId);
        if (coupon == null || couponUser == null) {
            return null;
        }

        // 检查是否超期
        Short timeType = coupon.getTimeType();
        Short days = coupon.getDays();
        LocalDateTime now = LocalDateTime.now();
        if (timeType.equals(CouponConstant.TIME_TYPE_TIME)) {
            if (now.isBefore(coupon.getStartTime()) || now.isAfter(coupon.getEndTime())) {
                return null;
            }
        }
        else if(timeType.equals(CouponConstant.TIME_TYPE_DAYS)) {
            LocalDateTime expired = couponUser.getAddTime().plusDays(days);
            if (now.isAfter(expired)) {
                return null;
            }
        }
        else {
            return null;
        }

        // 检测商品是否符合
        // TODO 目前仅支持全平台商品，所以不需要检测
        Short goodType = coupon.getGoodsType();
        if (!goodType.equals(CouponConstant.GOODS_TYPE_ALL)) {
            return null;
        }

        // 检测订单状态
        Short status = coupon.getStatus();
        if (!status.equals(CouponConstant.STATUS_NORMAL)) {
            return null;
        }
        // 检测是否满足最低消费
        if (checkedGoodsPrice.compareTo(coupon.getMin()) == -1) {
            return null;
        }

        return coupon;
    }

}
