package com.crud.repo;

import org.springframework.data.repository.CrudRepository;

import com.crud.dao.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

	public Employee findById(int id);

}
