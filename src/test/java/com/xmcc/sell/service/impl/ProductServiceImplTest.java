package com.xmcc.sell.service.impl;

import com.xmcc.sell.bean.ProductInfo;
import com.xmcc.sell.dao.ProductInfoDao;
import com.xmcc.sell.emmu.Statues;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl service;

    @Autowired
    private ProductInfoDao dao;

    @Test
    public void findOne() {


        Optional<ProductInfo> asd = service.findOne("asd");

    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = service.findUpAll();
        int size = upAll.size();
        System.out.println(size);
    }

    @Test
    public void findAll() {
        Pageable pageable = PageRequest.of(0, 2);
        Page<ProductInfo> all = dao.findAll(pageable);
        System.out.println(all);


    }

    @Test
    public void save() {
    }
}