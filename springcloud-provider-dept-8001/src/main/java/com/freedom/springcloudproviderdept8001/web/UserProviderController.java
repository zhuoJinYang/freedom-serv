package com.freedom.springcloudproviderdept8001.web;

import com.freedom.springcloudapi.entity.User;
import com.freedom.springcloudapi.service.IUserService;
import com.freedom.springcloudapi.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/provider/user")
public class UserProviderController {

    @Resource
    private IUserService userService;

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        user.setName("1");
        return user;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
