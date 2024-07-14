package com.dummy.provider;

import lombok.Getter;
import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

public class Payment  extends AbstractProvider<BaseProviders> {
    private static final PaymentType[] PAYMENT_TYPES = PaymentType.values();
    protected Payment(BaseProviders faker) {
        super(faker);
    }
    private PaymentType nextPayment() {
        return PAYMENT_TYPES[faker.random().nextInt(PAYMENT_TYPES.length)];
    }
    public String nextName() {
        return nextPayment().name();
    }

    @Getter
    private enum PaymentType {
        CARD("카드"),PAY("페이(카카오,네이버등)"),ACCOUNT("계좌이체");

        private final String typeName;

        PaymentType(String typeName) {
            this.typeName = typeName;
        }
    }

}
