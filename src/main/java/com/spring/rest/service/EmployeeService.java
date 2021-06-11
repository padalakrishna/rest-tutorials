package com.spring.rest.service;

import java.util.List;

import com.spring.rest.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployee(int empId);

	void saveEmployee(Employee emp);

	void updateEmployee(Employee emp);

	Employee deleteEmployee(int empId);

}
