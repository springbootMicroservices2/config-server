package com.example.employee.producer.config.employeeproducerconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeProducerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProducerConfigApplication.class, args);
	}

}
