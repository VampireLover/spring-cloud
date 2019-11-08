package com.xiaojun.serverfeign.controller;

import com.xiaojun.serverfeign.domain.vo.UserVo;
import com.xiaojun.serverfeign.service.UserService;
import com.xiaojun.serverfeign.service.UserVoService;
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
    @Resource
    UserVoService userVoService;
    @RequestMapping("/user/{uid}")
    public String uerOrder(@PathVariable Integer uid){
        return userService.userOrder(uid);
    }

    @RequestMapping("/findOrder")
    public UserVo findOrder(){
        return userVoService.findOrder();
    }
}
