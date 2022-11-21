package com.ravindra.ravindraproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class RavindraProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RavindraProjectApplication.class, args);
	}

}
