package com.example.herokuDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@SpringBootApplication
public class HerokuDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuDemoApplication.class, args);
	}

}
