package com.heidi.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heidi.common.utils.PageUtils;
import com.heidi.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-09 10:37:43
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

