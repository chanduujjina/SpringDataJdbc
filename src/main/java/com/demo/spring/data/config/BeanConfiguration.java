package com.demo.spring.data.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.demo.spring.data.controller.EmployeeController;

@Configuration
@ComponentScan(basePackages="com.demo.spring.data")
@PropertySource("classpath:db.properties")
public class BeanConfiguration {
	
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.userName}")
	private String userName;
	
	@Value("${jdbc.password}")
	private String password;
	
	
	@Bean
	public EmployeeController getEmployeeController() {
		return new EmployeeController();
	}
	
	
	@Bean
	public DataSource getDatasoure() {
		return new DriverManagerDataSource(url,userName, password);
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	

}
