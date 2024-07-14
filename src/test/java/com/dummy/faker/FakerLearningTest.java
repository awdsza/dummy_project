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

    
    @DisplayName("DataFaker 기본적인 프로젝트.")
    @Test
    void DataFakerLearningTest(){
    //given
        Faker faker = new Faker(Locale.KOREA);
        String userId = faker.idNumber().peselNumber();
        String userName = faker.name().fullName();
        String address = faker.address().fullAddress();
        System.out.println("userId = " + userId+", userName="+userName+", address="+address);
        //when

        //then
    }
}

