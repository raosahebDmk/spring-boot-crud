package com.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.Employee;
import com.crud.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee getEmployee()
	{	
		Employee emp = employeeRepo.findById(1);
		return emp;
	}
	
	public void saveEmployee()
	{
		Employee e = new Employee(3, "Jay", 40000, "Pune");
		
		Employee emp = employeeRepo.save(e);
		System.out.println(emp);
	}
	
}
