package com.example.config_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableConfigServer
@SpringBootConfiguration
public class Config01Application {

	public static void main(String[] args) {
		SpringApplication.run(Config01Application.class, args);
	}

}
