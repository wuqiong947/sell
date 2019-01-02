package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author wuguoqiong
 */
public interface CategoryService {

    /**
     * 根据主键查询一条
     * @param categoryId
     * @return ProductCategory
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有类目
     * @return List<ProductCategory>
     */
    List<ProductCategory> findAll();

    /**
     * 根据类目的types查询类目
     * @param categoryTypes
     * @return List<ProductCategory>
     */
    List<ProductCategory> findProductCategoriesByCategoryTypeIn(List<Integer> categoryTypes);

    /**
     * 保存或更新类目信息
     * @param productCategory
     * @return ProductCategory
     */
    ProductCategory save(ProductCategory productCategory);
}
