package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,10);
        Page<ProductInfo> productInfo = productService.findAll(pageRequest);
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findByUpStatus() {
    }

    @Test
    public void save() {
    }

    @Test
    public void addProductStock() {
        ProductInfo productInfo = productService.findOne(1);
        ProductInfo updateProduct = productService.addProductStock(productInfo, 5);
        Assert.assertNotNull(updateProduct);
    }

    @Test
    public void decreaseProductStock() {
    }
}