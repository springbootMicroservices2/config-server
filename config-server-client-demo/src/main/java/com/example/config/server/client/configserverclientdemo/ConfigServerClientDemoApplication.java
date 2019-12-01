package com.example.config.server.client.configserverclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RefreshScope annotation is used to load the configuration properties value from the Config server.
@RefreshScope
@RestController
public class ConfigServerClientDemoApplication {
	
	@Value("${text.greeting}")
	String welcomeText;

	@Value("${text.copyright}")
	String from;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerClientDemoApplication.class, args);
	}
	
	@RequestMapping(value = "/")
	   public String welcomeText() {
	      return welcomeText+" from "+from;
	   }

}
