package com.oneday.study.microservicestudyconsumer80;

import com.oneday.study.microservicestudyconsumer80.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
/**
 * 在启动该微服务式是能去加载我们定义的Ribbon配置类
 */
@RibbonClient(name="MICROSERVICESTUDY-DEPT",configuration = MySelfRule.class)
public class MicroservicestudyConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicestudyConsumer80Application.class, args);
    }

}
