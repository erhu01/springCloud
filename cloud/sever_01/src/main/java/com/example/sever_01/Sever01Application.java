package com.example.sever_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sever01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sever01Application.class, args);
	}

}
