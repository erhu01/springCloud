package com.example.client_02.sercice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


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
    @GetMapping("/getStr")
    String getStr();

}
