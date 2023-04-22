package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public String updateEmployee(@RequestBody Employee employee)
	{
		Employee e = employeeService.saveEmployee(employee);
		return "update data...";
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{		
		String resp = employeeService.deleteEmployee(id);
		return resp;
	}
	
	@GetMapping(value = "/get")
	public List<Employee> geAlltEmployee()
	{	
		return employeeService.getAllEmployee();
	}
	
}
