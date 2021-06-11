package com.spring.rest.dao;

import java.util.List;

import com.spring.rest.entity.Employee;

public interface EmployeeDao {
	
	List<Employee> getAll();
	
	Employee get(int empId);
	
	void save(Employee emp);
	
	void update(Employee emp);
	
	Employee delete(int empId);

}
