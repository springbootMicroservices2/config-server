package com.example.config.server.configserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer  // ==> Important!!
@SpringBootApplication
public class ConfigServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerDemoApplication.class, args);
	}

}
