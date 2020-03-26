package com.oneday.study.microservicestudyhystrixdashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroservicestudyHystrixDashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyHystrixDashbordApplication.class, args);
    }

}
