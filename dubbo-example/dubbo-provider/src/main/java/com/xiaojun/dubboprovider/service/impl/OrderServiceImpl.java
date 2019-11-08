package com.xiaojun.dubboprovider.service.impl;

import com.xioajun.dubboapi.dto.OrderDto;
import com.xioajun.dubboapi.service.OrderService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 小二哥哥
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getAllOrders() {
        List<OrderDto> orderDtos=new ArrayList<OrderDto>();
        OrderDto orderDto=new OrderDto();
        orderDto.setOrderNo(123456);
        orderDto.setClientNum(4);
        orderDto.setPrice(288.88);
        orderDtos.add(orderDto);
        return orderDtos;
    }
}
