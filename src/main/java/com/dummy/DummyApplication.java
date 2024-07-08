package com.dummy;

import org.quartz.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.quartz.JobBuilder.newJob;

@SpringBootApplication
@EnableScheduling
public class DummyApplication {

	public static void main(String[] args){

		SpringApplication.run(DummyApplication.class, args);
	}

}
