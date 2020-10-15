package com.example.client_02.controller;

import com.example.client_02.sercice.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 使用feign 进行远程调用
 * @Author: xiong
 * @Date: 2020/10/15 10:59
 */
@Controller
public class TestController {

    @Autowired
    private TestFeign testFeign;

    @GetMapping("/testFeign")
    @ResponseBody
    public String testFeign(){
        String str = testFeign.getStr("998595");
        return str;
    }


}
