package com.xmcc.sell.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    private String productName;

    private double productPrice;

    private int productStock;

    private String productDesc;

    private String productIcon;

    private Integer categoryType;

    private Date createTime;

    private Date UpdateTime;

    private Integer productStatus;


}
