package com.heidi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heidi.common.utils.PageUtils;
import com.heidi.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author heidicheung
 * @email 1463771855@qq.com
 * @date 2022-06-02 14:57:04
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

