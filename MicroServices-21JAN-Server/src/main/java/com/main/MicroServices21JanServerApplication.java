package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServices21JanServerApplication {

	public static void main(String[] args) {
		System.out.println("This is the eureka Server");
		SpringApplication.run(MicroServices21JanServerApplication.class, args);
	}

}
