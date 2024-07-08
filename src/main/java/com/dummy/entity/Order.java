package com.dummy.entity;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class Order {
    private Long id;
    private OrderProduct orderProduct;
    private LocalDateTime orderDate;
    private PaymentType paymentType;
    private Long totalPrice;

    public Order(List<Product> products, LocalDateTime orderDate){
        this.orderDate = orderDate;
        this.totalPrice = getTotalPrice(products);
    }
    private long getTotalPrice(List<Product> products){
        return products.stream().mapToInt(Product::getProductPrice).sum();
    }
}
