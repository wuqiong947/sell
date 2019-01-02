package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;


    @Test
    public void findOne(){
        ProductInfo productInfo = repository.findOne(1);
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findProductInfosByProductStatusIsTest(){
        List<ProductInfo> productInfoList = repository.findProductInfosByProductStatusIs(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findProductInfoByCategoryTypeInTest(){
        List<ProductInfo> productInfoList = repository.findProductInfosByCategoryTypeIn(Arrays.asList(65498,333));
        Assert.assertEquals(2,productInfoList.size());
    }

}