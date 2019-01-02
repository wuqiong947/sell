package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 * @author wuguoqiong
 */
@Getter
public enum ProductStatusEnum {

    /**
     * 商品的上架状态
     */
    UP(0,"上架"),

    /**
     * 商品的下架状态
     */
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
