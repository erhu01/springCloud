package com.example.client_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Client03Application {

	public static void main(String[] args) {
		SpringApplication.run(Client03Application.class, args);
	}

}
