package com.demo.spring.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring.data.dao.EmployeeDao;
import com.demo.spring.data.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
	}
	
    public Employee getEmployeeByName(String name) {
		return employeeDao.getEmployeeByName(name);
	}

}
