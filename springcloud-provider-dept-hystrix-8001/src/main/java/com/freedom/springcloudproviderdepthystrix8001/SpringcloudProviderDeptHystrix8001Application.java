package com.freedom.springcloudproviderdepthystrix8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.freedom.springcloudapi.mapper")
@ComponentScan({
        "com.freedom.springcloudapi",
        "com.freedom.springcloudproviderdepthystrix8001"
})
public class SpringcloudProviderDeptHystrix8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDeptHystrix8001Application.class, args);
    }

}
