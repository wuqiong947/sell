package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author wuguoqiong
 */
public interface ProductRepository extends JpaRepository<ProductInfo,Integer> {

    /**
     * 根据上下架状态查询商品.
     * @param productStatus
     * @return List<ProductInfo>
     */
    List<ProductInfo> findProductInfosByProductStatusIs(Integer productStatus);

    /**
     * 根据类目查询商品
     * @param CategoryTypes
     * @return List<ProductInfo>
     */
    List<ProductInfo> findProductInfosByCategoryTypeIn(List<Integer> CategoryTypes);


}
