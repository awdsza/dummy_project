package com.dummy.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class OrderProduct {
    private Long id;
    private Order order;
    private Product product;

    @Builder
    private OrderProduct(Order order, Product product) {
        this.order = order;
        this.product = product;
    }
}
