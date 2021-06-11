package com.spring.rest.entity;

public class Employee {
	
	private int empId;
	private String name;
	private String dept;
	private String number;
	
	public Employee() {
		
	}
	
	public Employee(int empId, String name, String dept, String number) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.number = number;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String toString() {
		return "employeeId:"+empId+" department:"+dept+" name:"+name+" mobileNumber:"+number;
	}
}
