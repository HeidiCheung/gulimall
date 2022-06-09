package com.heidi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heidi.common.utils.PageUtils;
import com.heidi.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-09 10:37:43
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

