package com.dummy.scheduler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@Slf4j
public class Scheduler {



    @Scheduled(cron =  "0 * * * * *")
    public void createOrderData(){
        Faker faker = new Faker(Locale.KOREA);
        log.info("정산 데이터 스케줄러 시작 ");
        String userId = faker.idNumber().peselNumber();
        String userName = faker.name().fullName();




    }
}
