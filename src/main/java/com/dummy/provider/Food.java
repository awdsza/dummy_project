package com.dummy.provider;

import net.datafaker.providers.base.AbstractProvider;
import net.datafaker.providers.base.BaseProviders;

public class Food  extends AbstractProvider<BaseProviders> {
    private static final String[] PRODUCTS= new String[]{
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
    public Food(BaseProviders faker) {
        super(faker);
    }
    public String nextName() {
        return PRODUCTS[faker.random().nextInt(PRODUCTS.length)];
    }

}
