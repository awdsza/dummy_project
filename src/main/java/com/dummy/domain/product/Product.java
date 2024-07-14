package com.dummy.domain.product;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Product {
    private String productName;
    private int productPrice;
    private int quantity;
    @Builder
    private Product(String productName, int productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }
}
