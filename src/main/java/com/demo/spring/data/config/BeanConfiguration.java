package com.demo.spring.data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.spring.data.controller.EmployeeController;

@Configuration
public class BeanConfiguration {
	
	
	@Bean
	public EmployeeController getEmployeeController() {
		return new EmployeeController();
	}
	
	

}
