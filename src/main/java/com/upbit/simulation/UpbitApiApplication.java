package com.upbit.simulation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.upbit")
public class UpbitApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpbitApiApplication.class, args);
    }

}
