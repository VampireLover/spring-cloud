package com.xioajun.dubboapi.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 小二哥哥
 */
@Data
public class OrderDto implements Serializable {
    private Integer orderNo;
    private Integer clientNum;
    private Double  price;

}
