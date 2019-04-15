package com.xmcc.sell.vopo;

import lombok.Data;

@Data
public class ProductVo<T> {
    private String name;
    private Integer type;
    private T foods;


}
