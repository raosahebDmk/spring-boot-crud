package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dao.Employee;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/get/{id}")
	public Employee getEmployeeData(@PathVariable int id)
	{	
		Employee emp = employeeService.getEmployee(id);
		System.out.println(emp);
		return emp;
	}
	
	@PostMapping(value = "/save")  
	public String saveEmployee(@RequestBody Employee employee)
	{
		Employee e = employeeService.saveEmployee(employee);
		System.out.println("employee save "+e);
		return "save data ...";
	}
	
	@PutMapping(value = "/update")
	public void updateEmployee(@RequestBody Employee employee)
	{
		System.out.println("req: "+employee);
		employeeService.updateEmployee(employee);
		
	}
	
}
