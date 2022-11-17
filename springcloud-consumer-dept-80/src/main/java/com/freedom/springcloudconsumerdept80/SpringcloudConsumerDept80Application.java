package com.freedom.springcloudconsumerdept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //开启Eureka 客户端
@SpringBootApplication
public class SpringcloudConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumerDept80Application.class, args);
    }

}
