package com.freedom.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//实现服务注册
@EnableDiscoveryClient
//开启hystrix支持
@EnableHystrix
@SpringBootApplication
public class NacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class, args);
    }
}
