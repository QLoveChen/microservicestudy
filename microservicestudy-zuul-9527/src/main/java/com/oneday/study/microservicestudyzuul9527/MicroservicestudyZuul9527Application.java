package com.oneday.study.microservicestudyzuul9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroservicestudyZuul9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyZuul9527Application.class, args);
    }

}
