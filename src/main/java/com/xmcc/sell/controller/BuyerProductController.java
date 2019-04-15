package com.xmcc.sell.controller;

import com.xmcc.sell.bean.ProductCategory;
import com.xmcc.sell.bean.ProductInfo;
import com.xmcc.sell.service.impl.CategoryServiceImpl;
import com.xmcc.sell.service.impl.ProductServiceImpl;
import com.xmcc.sell.utils.ResultVoUtil;
import com.xmcc.sell.vopo.ProductInfoVo;
import com.xmcc.sell.vopo.ProductVo;
import com.xmcc.sell.vopo.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/buyer/product")
public class BuyerProductController {

    //dd

    @Autowired
    private CategoryServiceImpl category;
    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping("/list")
    public ResultVo list(){

        List<ProductInfo> upAll = productService.findUpAll();
        List<ProductCategory> all = category.findAll();
        List<ProductVo> productVoList = new ArrayList<>();
        for ( ProductCategory p : all ){
            ProductVo productVo = new ProductVo<>();
            productVo.setType(p.getCategoryType());
            productVo.setName(p.getCategoryName());
            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo a   :upAll) {
                if (a.getCategoryType().equals(p.getCategoryType())){
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    productInfoVo.setName(a.getProductName());
                    productInfoVo.setDesc(a.getProductDesc());
                    productInfoVo.setPrice(a.getProductPrice());
                    productInfoVo.setIcon(a.getProductIcon());
                    productInfoVo.setId(a.getProductId());
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVo.setFoods(productInfoVoList );
            productVoList.add(productVo);
        }


        return ResultVoUtil.success( productVoList);
    }


}
