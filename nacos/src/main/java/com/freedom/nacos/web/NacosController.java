package com.freedom.nacos.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class NacosController {

    @GetMapping("invoke")
    // 配置降级方法
    @HystrixCommand(fallbackMethod = "timeOutInvoke",commandProperties = {
            //设置服务调用超时10秒时触发服务降级
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "10000")
    })
    public String invoke() throws InterruptedException {
        Thread.sleep(10000);
        return LocalTime.now() + ":invoke";
    }

    public String timeOutInvoke() {
        return "系统繁忙，请稍后再试";
    }
}
