package com.demo.spring.data.dao;

import com.demo.spring.data.dto.Employee;

public interface EmployeeDao {
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeByName(String name);

}
