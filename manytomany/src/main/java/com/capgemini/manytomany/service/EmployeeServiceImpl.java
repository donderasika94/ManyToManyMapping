package com.capgemini.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.manytomany.dao.EmployeeDao;
import com.capgemini.manytomany.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Set<Employee> addEmployee(Set<Employee> employee) {
		employeeDao.saveAll(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int Id) {
		return employeeDao.findById(Id).get();
	}


}
