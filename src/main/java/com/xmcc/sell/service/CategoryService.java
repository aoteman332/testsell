package com.xmcc.sell.service;

import com.xmcc.sell.bean.ProductCategory;

import java.util.List;
import java.util.Optional;


public interface CategoryService {
    Optional<ProductCategory> findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeBy(List<Integer> list);


    ProductCategory save(ProductCategory category);


}
