package com.example.Greet_Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.example.Greet_Microservice")
public class GreetMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetMicroserviceApplication.class, args);
	}

}
