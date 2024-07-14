package com.dummy.scheduler;

import com.dummy.domain.product.Product;
import com.dummy.provider.CustomFaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datafaker.Faker;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
@Slf4j
@RequiredArgsConstructor
public class Scheduler {

    private final CustomFaker customFaker;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    public JSONObject createJSONObject(){
        Faker faker = new Faker(Locale.KOREA);
        String identifyNumber = faker.idNumber().peselNumber();
        String userName = faker.name().fullName();
        String payment = customFaker.payment().nextName();

        int size = new Random().nextInt(1,20);
        List<Product> list = new ArrayList<>();
        for(int j=0;j<size;j++){
            String productName = customFaker.products().nextName();
            int quantity = new Random().nextInt(1,20);
            int price = new Random().nextInt(1000,100000);
            list.add(Product.builder()
                    .productName(productName)
                    .productPrice(price)
                    .quantity(quantity)
                    .build());
        }
        return new JSONObject(RawData.builder()
                .identifyNumber(identifyNumber)
                .userName(userName)
                .paymentType(payment)
                .productList(list)
                .orderDate(LocalDateTime.now().format(formatter))
                .build());
    }
    @Scheduled(cron =  "0 * * * * *")
    public void createDummyData() throws IOException {

        JSONArray jsonList = new JSONArray();
        int size = new Random().nextInt(5000,10000);
        for(int i=0;i<size;i++){
            JSONObject jsonObject = createJSONObject();
            jsonList.put(jsonObject);
        }
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(formatter);
        File file = new File("/Users/juheonlee/Desktop/dummy/order_"+format+".json");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(jsonList.toString());
        bw.close();
    }
}
