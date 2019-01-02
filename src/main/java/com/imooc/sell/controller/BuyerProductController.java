package com.imooc.sell.controller;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 买家商品
 * @author wuguoqiong
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ResultVO resultVO = new ResultVO();
        return resultVO;
    }
}
