package com.tommy.gettingFamiliarRouting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GettingFamiliarRoutingApplication {
	
	@RequestMapping("/application")
	public String world() {
		return "Main Page!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GettingFamiliarRoutingApplication.class, args);
		
	}

}
