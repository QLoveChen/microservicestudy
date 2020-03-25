package com.oneday.study.microservicestudyprovider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicestudyProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyProvider8001Application.class, args);
    }

}
