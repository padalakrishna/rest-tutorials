package com.spring.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.dao.EmployeeDao;
import com.spring.rest.entity.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAll();
	}

	@Override
	public Employee getEmployee(int empId) {
		return employeeDao.get(empId);
	}

	@Override
	public void saveEmployee(Employee emp) {
		employeeDao.save(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.update(emp);
		
	}

	@Override
	public Employee deleteEmployee(int empId) {
		return employeeDao.delete(empId);
	}
}
