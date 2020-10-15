package com.example.client_03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: xiong
 * @Date: 2020/10/15 10:53
 */
@Controller
public class TestController {

    @GetMapping("/getStr")
    @ResponseBody
    public String getStr(){
        System.out.println("服务三 ： 被调用");
        return "client_03 返回值";
    }

}
