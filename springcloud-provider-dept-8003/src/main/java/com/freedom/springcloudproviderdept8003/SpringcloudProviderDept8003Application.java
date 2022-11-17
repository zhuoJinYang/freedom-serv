package com.freedom.springcloudproviderdept8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

// @EnableEurekaClient 开启Eureka客户端注解，在服务启动后自动向注册中心注册服务
@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.freedom.springcloudapi.mapper")
@ComponentScan({
        "com.freedom.springcloudapi",
        "com.freedom.springcloudproviderdept8003"
})
public class SpringcloudProviderDept8003Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderDept8003Application.class, args);
    }

}
