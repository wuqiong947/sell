package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuguoqiong
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    /**
     * 查询在category_type参数列表中的数据
     * @param categoryTypes
     * @return  List<ProductCategory>
     */
    List<ProductCategory> findProductCategoriesByCategoryTypeIn(List<Integer> categoryTypes);

}
