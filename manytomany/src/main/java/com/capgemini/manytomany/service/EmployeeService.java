package com.capgemini.manytomany.service;

import java.util.Set;

import com.capgemini.manytomany.entity.Employee;

public interface EmployeeService {
	
	
	
	public Set<Employee> addEmployee(Set<Employee> employee);

	public Employee getEmployeeById(int Id);

}
