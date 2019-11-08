package com.xiaojun.serverfeign.domain.vo;

import com.xioajun.dubboapi.dto.OrderDto;
import lombok.Data;

import java.util.List;

/**
 * @author 小二哥哥
 */
@Data
public class UserVo {

    private Integer uid;
    private String name;
    private String sex;
    private Integer age;
    private List<OrderDto> orderDtos;

}
