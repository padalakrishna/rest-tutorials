package com.spring.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entity.Employee;
import com.spring.rest.service.EmployeeService;


@RestController
@RequestMapping(value = "/hr-application")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	
	@GetMapping(value = "/fetch-employee/{id}", produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public Employee getEmployee(@PathVariable("id") Integer id) {
		return empService.getEmployee(id);
	}
	
	@GetMapping(value = "/fetch-all-employees")
	public List<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}
	
	@PostMapping(value = "/save-employee")
	public Map<String,String> saveEmployee(@RequestParam("id") Integer id, @RequestBody Employee emp) {
		empService.saveEmployee(emp);
		Map<String,String> response = new HashMap<String,String>();
		response.put("isEmpSave", "Employee Saved successfully");
		return response;
	}
	
	@PutMapping(value = "/update-employee")
	public Map<String,String> updateEmployee(@RequestParam("id") Integer id, @RequestBody Employee emp) {
		empService.updateEmployee(emp);
		Map<String,String> response = new HashMap<String,String>();
		response.put("isEmpUpdated", "Employee Updated successfully");
		return response;
	}
	
	
	@DeleteMapping(value = "/delete-employee")
	public Employee deleteEmployee(@RequestParam("id") Integer id) {
		Employee emp = empService.deleteEmployee(id);
		return emp;
	}
	
	
	
	
	
	
}
