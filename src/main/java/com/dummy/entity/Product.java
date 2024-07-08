package com.dummy.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Product {
    private Long id;
    private String productName;
    private int productPrice;

    @Builder
    private Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}
