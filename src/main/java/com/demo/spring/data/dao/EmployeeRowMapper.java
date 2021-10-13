package com.demo.spring.data.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.spring.data.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		return Employee.builder().id(rs.getInt("id")).name(rs.getString("name")).
		gender(rs.getString("gender")).deptName(rs.getString("deptName")).salary(rs.getInt("salary")).build();
	}

}
