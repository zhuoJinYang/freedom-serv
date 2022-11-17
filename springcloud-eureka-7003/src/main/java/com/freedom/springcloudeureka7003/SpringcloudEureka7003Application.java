package com.freedom.springcloudeureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// @EnableEurekaServer 服务端的启动类，可以接受别人注册进来~
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEureka7003Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEureka7003Application.class, args);
    }

}
