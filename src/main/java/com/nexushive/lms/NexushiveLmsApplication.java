package com.nexushive.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NexushiveLmsApplication {

	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(NexushiveLmsApplication.class, args);
	}
}
