package com.dummy.scheduler;


import com.dummy.domain.product.Product;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RawData {
    private String identifyNumber;
    private String userName;
    private String paymentType;
    private String orderDate;
    List<Product> productList = new ArrayList<>();

    @Builder
    private RawData(String identifyNumber, String userName, String paymentType, String orderDate, List<Product> productList) {
        this.identifyNumber = identifyNumber;
        this.userName = userName;
        this.productList = productList;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
    }
}
