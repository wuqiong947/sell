package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.repository.ProductRepository;
import com.imooc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuguoqiong
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductInfo findOne(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Page<ProductInfo> findAll(PageRequest pageRequest) {
        return productRepository.findAll(pageRequest);
    }

    @Override
    public List<ProductInfo> findByUpStatus() {
        return productRepository.findProductInfosByProductStatusIs(ProductStatusEnum.UP.getCode());
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productRepository.save(productInfo);
    }

    @Override
    public ProductInfo addProductStock(ProductInfo productInfo, Integer stockNum) {
        productInfo.setProductStock(productInfo.getProductStock() + stockNum);
        return productRepository.save(productInfo);
    }

    @Override
    public ProductInfo decreaseProductStock(ProductInfo productInfo, Integer stockNum) {
        productInfo.setProductStock(productInfo.getProductStock() - stockNum);
        return productRepository.save(productInfo);
    }
}
