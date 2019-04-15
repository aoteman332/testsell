package com.xmcc.sell.service.impl;

import com.xmcc.sell.bean.ProductInfo;
import com.xmcc.sell.dao.ProductInfoDao;
import com.xmcc.sell.emmu.Statues;
import com.xmcc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoDao dao;

    @Override
    public Optional<ProductInfo> findOne(String id) {

        return dao.findById(id);
    }

    @Override
    public List<ProductInfo> findUpAll() {
       return dao.findByProductStatus(Statues.UP);
    }


    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return dao.findAll(pageable) ;
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return dao.save(productInfo);
    }
}
