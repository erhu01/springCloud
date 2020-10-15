package com.example.client_01.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: xiong
 * @Date: 2020/10/15 10:53
 */
@Controller
public class TestController {
    @PostMapping("/getStr")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "hiFail")//hystrix 发生错误后跳转的方法
    public String getStr(@RequestParam("a") String a){
        System.out.println("服务一 ： 被调用");
        System.out.println(2/0);
        return "client_01 返回值"+"-------"+a;
    }

    public String hiFail(String a){
        return "hystrix ---- 发生错误！";
    }


}
