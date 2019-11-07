package com.xiaojun.serverconsumer.controller;

import com.xiaojun.serverconsumer.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/order/{uid}")
    public  String UserOrder(@PathVariable Integer uid){

        return userService.getOrder(uid);
    }
}
