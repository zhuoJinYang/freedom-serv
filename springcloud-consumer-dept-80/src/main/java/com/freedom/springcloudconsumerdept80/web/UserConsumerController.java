package com.freedom.springcloudconsumerdept80.web;

import com.freedom.springcloudapi.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer/user")
public class UserConsumerController {

    @Resource
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-HYSTRIX";

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/provider/user/" + id,User.class);
    }
}
