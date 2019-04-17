package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int projectId;
	private String projectDesr;
	  @ManyToMany(mappedBy = "project")
	private Set<Employee> employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectDesr() {
		return projectDesr;
	}

	public void setProjectDesr(String projectDesr) {
		this.projectDesr = projectDesr;
	}

	/*
	 * public Set<Employee> getEmployee() { return employee; }
	 */
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	public Project(int projectId, String projectDesr) {
		super();
		this.projectId = projectId;
		this.projectDesr = projectDesr;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectDesr=" + projectDesr + "]";
	}
	
	
	
	

}
