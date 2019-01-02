package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @author wuguoqiong
 */
public interface ProductService {

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    ProductInfo findOne(Integer id);

    /**
     * 查询所有商品
     * @return
     */
    Page<ProductInfo> findAll(PageRequest pageRequest);

    /**
     * 查询
     * @return
     */
    List<ProductInfo> findByUpStatus();

    /**
     * 新增或者更新
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加商品库存
     * @param productInfo
     * @param stockNum
     * @return
     */
    ProductInfo addProductStock(ProductInfo productInfo,Integer stockNum);

    /**
     * 减商品库存
     * @param productInfo
     * @param stockNum
     * @return
     */
    ProductInfo decreaseProductStock(ProductInfo productInfo,Integer stockNum);
}
