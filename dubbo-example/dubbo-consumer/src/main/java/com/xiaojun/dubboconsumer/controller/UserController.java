package com.xiaojun.dubboconsumer.controller;

import com.xiaojun.dubboconsumer.domain.vo.UserVo;
import com.xiaojun.dubboconsumer.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping("/findOrder")
    public UserVo findOrder(){
        return userService.findOrder();
    }
}
