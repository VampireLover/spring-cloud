package com.xioajun.dubboapi.service;

import com.xioajun.dubboapi.dto.OrderDto;

import java.util.List;

public interface OrderService {

    List<OrderDto> getAllOrders();
}
