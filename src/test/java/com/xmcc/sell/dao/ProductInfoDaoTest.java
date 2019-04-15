package com.xmcc.sell.dao;

import com.xmcc.sell.bean.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao dao;

    @Test
    public void t1(){

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123");
        productInfo.setProductName("zhou");
        productInfo.setProductPrice(3.2);
        productInfo.setProductStock(100);
        productInfo.setProductDesc("asdad");
        productInfo.setProductIcon("aksdlas");
        productInfo.setCategoryType(2);
        productInfo.setCreateTime(new Date());
        productInfo.setUpdateTime(new Date());
        productInfo.setProductStatus(0);
        dao.save(productInfo);
    }

    @Test
    public void  t3(){
        List<ProductInfo> byProductStatus = dao.findByProductStatus(0);

        System.out.println(byProductStatus.size());
    }

}