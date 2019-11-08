package com.xiaojun.dubboconsumer.service.impl;

import com.xiaojun.dubboconsumer.domain.vo.UserVo;
import com.xiaojun.dubboconsumer.service.UserService;
import com.xioajun.dubboapi.dto.OrderDto;
import com.xioajun.dubboapi.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 小二哥哥
 */
@Service
public class UserServiceImpl implements UserService {
    @Reference
    private OrderService orderService;
    @Override
    public UserVo findOrder() {
        List<OrderDto> orders = orderService.getAllOrders();
        UserVo userVo=new UserVo();
        userVo.setUid(1);
        userVo.setName("刘昊然");
        userVo.setAge(21);
        userVo.setSex("男");
        userVo.setOrderDtos(orders);
        return userVo;
    }
}
