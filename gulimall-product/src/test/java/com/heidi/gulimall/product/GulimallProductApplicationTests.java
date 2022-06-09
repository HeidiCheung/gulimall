package com.heidi.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.heidi.gulimall.product.entity.BrandEntity;
import com.heidi.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(13L);
//        brandEntity.setDescript("華為");
//        brandService.save(brandEntity);
//        System.out.println("保存成功....");
//
//
//        brandService.updateById(brandEntity);
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 13));
        list.forEach((item)-> System.out.println(item));

    }

}
