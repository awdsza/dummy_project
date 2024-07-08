package com.dummy.faker;

import net.datafaker.Faker;
import net.datafaker.idnumbers.PolishIdNumber;
import net.datafaker.providers.base.Company;
import net.datafaker.providers.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class FakerLearningTest {

    
    @DisplayName("")
    @Test
    void test(){
    //given
        Faker faker = new Faker(Locale.KOREA);
        String userId = faker.idNumber().peselNumber();
        String userName = faker.name().fullName();
        String address = faker.address().fullAddress();
        System.out.println("userId = " + userId+", userName="+userName+", address="+address
        );
        int count = new Random(20).nextInt();
        for(int i=0;i<count;i++){
            //derProducts.productName
        }


        //when

    //then
    }
}

