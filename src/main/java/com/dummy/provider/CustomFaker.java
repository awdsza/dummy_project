package com.dummy.provider;

import net.datafaker.Faker;
import org.springframework.stereotype.Component;

@Component
public class CustomFaker extends Faker {
    public Products products(){
        return getProvider(Products.class, Products::new);
    }
    public Payment payment(){
        return getProvider(Payment.class,Payment::new);
    }
}
