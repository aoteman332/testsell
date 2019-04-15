package com.xmcc.sell.service.impl;

import com.xmcc.sell.bean.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl service;

    @Test
    public void findOne() {
        Optional<ProductCategory> one = service.findOne(1);

        System.out.println(one);

    }

    @Test
    public void findAll() {
        List<ProductCategory> all = service.findAll();
        System.out.println(all.size());
    }

    @Test
    public void findByCategoryTypeBy() {

    }



    @Test
    public void save() {
    }
}