package com.crud.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dao.Employee;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/get")
	public Employee getEmployeeData()
	{	
		Employee emp = employeeService.getEmployee();
		System.out.println(emp);
		return emp;
	}
	
}
