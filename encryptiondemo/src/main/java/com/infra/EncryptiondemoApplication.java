package com.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EncryptiondemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncryptiondemoApplication.class, args);
	}

}
