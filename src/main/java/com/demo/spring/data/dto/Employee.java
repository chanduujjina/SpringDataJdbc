package com.demo.spring.data.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
	
	private int id;
	
	private String name;
	
	private String gender;
	
	private String deptName;
	
	private int salary;

}
