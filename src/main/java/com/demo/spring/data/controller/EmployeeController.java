package com.demo.spring.data.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.spring.data.dto.Employee;
import com.demo.spring.data.service.EmployeeService;

public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	public void saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
	}
	
	
	
	public Employee getEmployeeByName(String name) {
		return employeeService.getEmployeeByName(name);
	}
	

}
