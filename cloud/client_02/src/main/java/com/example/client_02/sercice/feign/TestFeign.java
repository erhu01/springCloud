package com.example.client_02.sercice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Author: xiong
 * @Date: 2020/10/15 11:08
 */

/**
 * 服务名称
 */
@FeignClient(value = "client-01")
public interface TestFeign {


    /**
     * 调用的接口名
     * @return
     */
    @PostMapping("/getStr")
    String getStr(@RequestParam("a") String a);

}
