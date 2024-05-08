package com.anuscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class TimeManagerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeManagerBackendApplication.class, args);
	}

	@GetMapping
	public List<String> greet(){
		return List.of("Hello", "World");
	}

}
