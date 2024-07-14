package com.dummy.provider;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

import java.util.function.Supplier;

public class Products extends AbstractProvider<BaseProviders> {
    private static final String[] PRODUCTS= new String[]{
           "사나디코퍼레이션 유아용 헬로키티 파라솔 자동차보행기 튜브, 혼합색상",
           "키즈원 스윔비 3in1 유아튜브 1단계 BR-SB1, 혼합색상",
           "스윔비 유아튜브 2단계 BR-SB2, 혼합색상",
           "위니코니 캐치 티니핑 자동차 쿠션 보행기 튜브 CT-21W51, 혼합색상",
            "오뚜기 맛있는 오뚜기밥, 210g, 24개",
            "동원 라이트 스탠다드 참치, 85g, 8개",
            "펩시 제로슈거 라임향, 210ml, 30개",
            "신라면멀티120g*5/농심-10개, 10개",
            "블루다이아몬드 아몬드 브리즈 오리지널, 190ml, 24개",
            "서울우유 비요뜨 초코링 요거트, 138g, 12개",
            "농심 올리브 짜파게티 5개입, 5개",
            "해표 카놀라유, 900ml, 3개",
            "사세 버팔로윙 (냉동), 1kg, 1개",
            "티젠 콤부차 레몬, 5g, 50개입, 1개"
       };
    protected Products(BaseProviders faker) {
        super(faker);
    }
    public String nextName() {
        return PRODUCTS[faker.random().nextInt(PRODUCTS.length)];
    }

}
