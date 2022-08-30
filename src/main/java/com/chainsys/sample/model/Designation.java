package com.chainsys.sample.model;

public class Designation {

	private String dept;
	private String position;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Designation [dept=" + dept + ", position=" + position + "]";
	}

	
}
