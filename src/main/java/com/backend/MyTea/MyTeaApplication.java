package com.backend.MyTea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@SpringBootApplication
public class MyTeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTeaApplication.class, args);
		
		System.out.println("Hello all My applicaion is ready...");
	}

}
