package com.example.client_01.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 配置类
 * @Author: xiong
 * @Date: 2020/10/19 13:06
 */
@Component
@ConfigurationProperties(prefix = "test")
@RefreshScope
@Data
public class Config {

    private String test;

}
