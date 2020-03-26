package com.oneday.study.microservicestudyfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
/**
 * 在启动该微服务式是能去加载我们定义的Feign配置类
 */
@EnableFeignClients(basePackages = "com.oneday.study")
@ComponentScan("com.oneday.study")
public class MicroservicestudyFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyFeignApplication.class, args);
    }

}
