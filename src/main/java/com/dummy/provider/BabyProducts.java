package com.dummy.provider;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.util.function.Supplier;

public class BabyProducts extends AbstractProvider<BaseProviders> {
    private static final String[] PRODUCTS= new String[]{
           "사나디코퍼레이션 유아용 헬로키티 파라솔 자동차보행기 튜브, 혼합색상"
           ,"키즈원 스윔비 3in1 유아튜브 1단계 BR-SB1, 혼합색상"
           ,"스윔비 유아튜브 2단계 BR-SB2, 혼합색상"
           ,"위니코니 캐치 티니핑 자동차 쿠션 보행기 튜브 CT-21W51, 혼합색상"
       };
    protected BabyProducts(BaseProviders faker) {
        super(faker);
    }
    public String nextName() {
        return PRODUCTS[faker.random().nextInt(PRODUCTS.length)];
    }

}
