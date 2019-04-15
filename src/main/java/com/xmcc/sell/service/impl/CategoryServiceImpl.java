package com.xmcc.sell.service.impl;

import com.xmcc.sell.bean.ProductCategory;
import com.xmcc.sell.dao.ProductCategoryDao;
import com.xmcc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryDao dao;

    @Override
    public Optional<ProductCategory> findOne(Integer categoryId) {

        return dao.findById(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return dao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeBy(List<Integer> list) {
        return dao.findByCategoryTypeIn(list);
    }


    @Override
    public ProductCategory save(ProductCategory category) {
        return dao.save(category);
    }
}
