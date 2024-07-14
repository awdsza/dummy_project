package com.dummy.api.scheduler;

import com.dummy.api.scheduler.request.UserRequest;
import com.dummy.scheduler.Scheduler;
import net.datafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("test")
class SchedulerTest {

    @Autowired
    private Scheduler scheduler;

    @DisplayName("더미 데이터가 정상적으로 10000건이 생성되는지 확인한다.")
    @Test
    void createDummyData(){
        //given
//        scheduler.createOrderData();
    }

}