package com.heidi.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heidi.common.utils.PageUtils;
import com.heidi.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-09 10:59:30
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

