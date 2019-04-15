package com.xmcc.sell.dao;

import com.xmcc.sell.bean.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao dao;

    @Test
    public void t1(){
        ProductCategory one = dao.getOne(1);
        System.out.println(one);
    }
    @Test
    public void t2(){
        ProductCategory productCategory = new ProductCategory();


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        List<ProductCategory> byCategoryTypeIn = dao.findByCategoryTypeIn(list);
        int size = byCategoryTypeIn.size();


    }


}