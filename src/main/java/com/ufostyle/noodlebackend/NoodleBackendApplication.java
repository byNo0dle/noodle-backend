package com.ufostyle.noodlebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NoodleBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoodleBackendApplication.class, args);
	}

}
