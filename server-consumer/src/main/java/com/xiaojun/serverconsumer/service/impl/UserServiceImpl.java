package com.xiaojun.serverconsumer.service.impl;

import com.xiaojun.serverconsumer.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 调用方式
 * HTTP协议调用
 * RestTemplate
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private RestTemplate restTemplate;

    @Override
    public String getOrder(Integer uid) {
        return restTemplate.getForObject("http://server-provider1/orders/"+uid,String.class);
    }
}
