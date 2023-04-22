package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.Employee;
import com.crud.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee getEmployee(int id)
	{	
		Employee emp = employeeRepo.findById(id);
		return emp;
	}
	
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepo.save(employee);
	}

	public String updateEmployee(Employee employee)
	{
		employeeRepo.save(employee);
		return "update data..";
	}
	
}
