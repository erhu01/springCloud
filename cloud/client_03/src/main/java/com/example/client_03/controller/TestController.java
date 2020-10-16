package com.example.client_03.controller;

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
    public String getStr(@RequestParam("a") String a){
        System.out.println("服务一 ： 被调用");
        //System.out.println(2/0);
        return "client_01 返回值"+"-------"+a;
    }

    public String hiFail(String a){
        return "hystrix ---- 发生错误！";
    }

    @RequestMapping("/getAbc")
    @ResponseBody
    public String getAbc(){
        System.out.println("我来了 客户端 3");
        return "我来了 客户端 3";
    }

}
