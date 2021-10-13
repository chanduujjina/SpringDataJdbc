package com.demo.spring.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.spring.data.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveEmployee(Employee emp) {
		
		String sql = "insert into employee "
				+ "values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getGender()+"','"+emp.getDeptName()+"','"+emp.getSalary()+"')";
		
		jdbcTemplate.update(sql);
	}

	@Override
	public Employee getEmployeeByName(String name) {
		String sql = "select * from employee where name =?";
		return jdbcTemplate.queryForObject(sql,new Object[] {name} ,new EmployeeRowMapper());
		
	}

}
