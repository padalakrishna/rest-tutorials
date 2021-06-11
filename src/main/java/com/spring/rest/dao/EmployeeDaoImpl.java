package com.spring.rest.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.spring.rest.entity.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private Map<Integer,Employee> empMap = new HashMap<Integer,Employee>();
	
	public EmployeeDaoImpl() {
		empMap.put(1, new Employee(1 , "Krishna Prasad", "Debit Cards", "9090909090"));
		empMap.put(2, new Employee(2, "Chaitanya", "Credit Cards", "9191919191"));
		empMap.put(3, new Employee(3, "Anusha", "Loans Department", "9292929292"));
		empMap.put(4, new Employee(4, "Shilpa", "Debit Cards", "9393939393"));
		empMap.put(5, new Employee(5, "Sandeep", "Loans Department", "9494949494"));
	}
	

	@Override
	public List<Employee> getAll() {
		return empMap.values().stream().collect(Collectors.toList());
	}

	@Override
	public Employee get(int empId) {
		Employee emp = empMap.get(empId); // Trying to mock that getting a response from DB.
		return emp;
	}

	@Override
	public void save(Employee emp) {
		empMap.put(emp.getEmpId(), emp);
		

	}

	@Override
	public void update(Employee emp) {
		Employee oldEmpData = empMap.get(emp.getEmpId());
		oldEmpData.setDept(emp.getDept());
		oldEmpData.setName(emp.getName());
		oldEmpData.setNumber(emp.getNumber());
	}

	@Override
	public Employee delete(int empId) {
		Employee deletedEmp = empMap.remove(empId);
		return deletedEmp;
	}

}
