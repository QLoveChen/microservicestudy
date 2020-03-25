package com.oneday.study.microservicestudyprovider8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicestudyProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyProvider8002Application.class, args);
    }

}
