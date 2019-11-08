package com.xiaojun.serverfeign.service;

import com.xiaojun.serverfeign.domain.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("dubbo-comsumer-xiaojun")
public interface UserVoService {

    @RequestMapping("/findOrder")
    public UserVo findOrder();
}
