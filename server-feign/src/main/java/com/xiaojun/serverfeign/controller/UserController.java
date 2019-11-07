package com.xiaojun.serverfeign.controller;

import com.xiaojun.serverfeign.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/user/{uid}")
    public String uerOrder(@PathVariable Integer uid){
        return userService.userOrder(uid);
    }
}
