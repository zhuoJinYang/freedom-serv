package com.freedom.nacosclient.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class NacosClientController {
    @Resource
    private ProviderFeign providerFeign;

    @GetMapping("/test")
    public String test(){
        return providerFeign.invoke();
    }
}

@FeignClient("nacos-provider")
interface ProviderFeign{
    @GetMapping("invoke")
    String invoke();
}