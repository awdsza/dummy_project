package com.dummy.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PaymentType {
    CARD("카드"),PAY("페이(카카오,네이버등)");

    private final String typeName;
}
