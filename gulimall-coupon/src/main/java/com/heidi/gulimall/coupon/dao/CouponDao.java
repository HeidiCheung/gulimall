package com.heidi.gulimall.coupon.dao;

import com.heidi.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-09 10:37:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
