package com.xmcc.sell.vopo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoVo {
    private String id;
    private String name;
    private double price;
    private String desc;
    private String icon;
}
