package com.heidi.gulimall.order.dao;

import com.heidi.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-09 10:59:30
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
