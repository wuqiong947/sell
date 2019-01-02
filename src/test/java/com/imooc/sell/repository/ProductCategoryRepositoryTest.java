package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void updateOneTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱",65498);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findProductCategoriesByCategoryTypeTest(){
        List<ProductCategory> productCategoryList = productCategoryRepository.findProductCategoriesByCategoryTypeIn(Arrays.asList(233,333));
        Assert.assertNotNull(productCategoryList);
    }
}