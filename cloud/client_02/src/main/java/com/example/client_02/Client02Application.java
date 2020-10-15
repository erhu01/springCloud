package com.example.client_02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
/** 开启 Eureka 客户端 */
@EnableEurekaClient
/** 开启 Feign 扫描支持 */
@EnableFeignClients
public class Client02Application {

	public static void main(String[] args) {
		SpringApplication.run(Client02Application.class, args);
	}

}
