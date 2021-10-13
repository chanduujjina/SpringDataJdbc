package com.demo.spring.data.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.data.config.BeanConfiguration;
import com.demo.spring.data.controller.EmployeeController;
import com.demo.spring.data.dto.Employee;

public class EmployeeInfoClient {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		EmployeeController employeeController = applicationContext.getBean(EmployeeController.class);
		
		//Employee emp =Employee.builder().id(4).name("sai").deptName("it").gender("male").salary(200000).build();
		//employeeController.saveEmployee(emp);
		
		Employee employee = employeeController.getEmployeeByName("divya");
		System.out.println(employee);
	}

}
