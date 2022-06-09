package com.heidi.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heidi.common.utils.PageUtils;
import com.heidi.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-09 10:59:30
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

