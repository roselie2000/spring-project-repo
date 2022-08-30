package com.chainsys.sample.model;

public class Employee {

	private int empId;
	private String name;
	private String design;

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

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}
	
	public void showDetails() {
		System.out.println(this.empId);
		System.out.println("Employee Name :" + this.name);
		System.out.println("Employee designation :" + this.design);
	}

}
