package com.capgemini.manytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;
import com.capgemini.manytomany.service.EmployeeService;

@RestController
public class EmployeeProjectController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/show")
	public Set<Employee> addNewEmp() {
			Set<Project> projects = new HashSet<>();
			projects.add(new Project(201,"Java"));
			projects.add( new Project (202,"Python"));

			Set<Employee> employees = new HashSet<>();
			employees.add(new Employee(101,"Rasika",projects));

			service.addEmployee(employees);
			return employees;
		}
				
	@RequestMapping("/new")
	public Set<Employee> addNew() {

		Set<Project> projects = new HashSet<Project>();
		Set<Project> project1 = new HashSet<Project>();
		projects.add(new Project(402, "JAVA"));
		projects.add(new Project(403, ".net"));

		project1.add(new Project(401, "Web"));
		project1.add(new Project(404, "Spring"));

		Set<Employee> employees = new HashSet<Employee>();

		employees.add(new Employee(104, "Stefan", projects));
		employees.add(new Employee(105, "Damon", project1));

		service.addEmployee(employees);
		return employees;

	}

	@RequestMapping("/byid")
	public Employee byId() {
		return service.getEmployeeById(101);

	}

}
