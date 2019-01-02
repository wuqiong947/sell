package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * @author wuguoqiong
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    /**
     * 商品id.
     */
    @Id
    @GeneratedValue
    private Integer productId;

    /**
     * 商品名称.
     */
    private String productName;

    /**
     * 商品单价.
     */
    private BigDecimal productPrice;

    /**
     * 商品库存.
     */
    private Integer productStock;

    /**
     * 商品描述.
     */
    private String productDescription;

    /**
     * 商品图标.
     */
    private String productIcon;

    /**
     * 商品状态. 0正常，1下架
     */
    private Integer productStatus;

    /**
     * 类目编号.
     */
    private Integer categoryType;

    /**
     * 创建时间.
     */
    private Date createTime;

    /**
     * 修改时间.
     */
    private Date updateTime;

}
