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
	
	// save and update both will work
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepo.save(employee);
	}
	
	public String deleteEmployee(int id)
	{
		employeeRepo.deleteById(id);
		return "delete data...";
	}
	
}
