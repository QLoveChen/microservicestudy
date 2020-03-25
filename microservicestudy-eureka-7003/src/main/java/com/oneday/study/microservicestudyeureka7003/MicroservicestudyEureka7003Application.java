package com.oneday.study.microservicestudyeureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**
 * 启用eureka服务,接收其他服务注册
 */
@EnableEurekaServer
public class MicroservicestudyEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyEureka7003Application.class, args);
    }

}
