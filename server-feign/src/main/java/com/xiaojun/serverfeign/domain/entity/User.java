package com.xiaojun.serverfeign.domain.entity;

import lombok.Data;

@Data
public class User {
    private Integer uid;
    private String name;
    private String sex;
    private Integer age;
}
