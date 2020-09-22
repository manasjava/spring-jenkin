package com.ci.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "Success message";
	}

}
