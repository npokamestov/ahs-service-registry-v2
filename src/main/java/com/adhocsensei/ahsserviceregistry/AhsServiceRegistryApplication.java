package com.adhocsensei.ahsserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AhsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AhsServiceRegistryApplication.class, args);
	}

}
