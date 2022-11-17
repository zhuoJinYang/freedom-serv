package com.freedom.springcloudproviderdepthystrix8001.web;

import com.freedom.springcloudapi.entity.User;
import com.freedom.springcloudapi.service.impl.UserServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/provider/user")
public class UserController {

    @Resource
    private UserServiceImpl userServiceImpl;

    @HystrixCommand(fallbackMethod = "hystrixGet")
    @RequestMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        User user = userServiceImpl.getById(id);
        if (user == null) {
            throw new RuntimeException("这个id=>"+id+",不存在该用户，或信息无法找到~");
        }
        return user;
    }

    public User hystrixGet(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("这个id=>"+id+",没有对应的信息,null---@Hystrix~");
        user.setAge(0);
        return user;
    }
}
