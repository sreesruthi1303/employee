package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
public class Employee {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getSalaryPM() {
		return salaryPM;
	}
	public void setSalaryPM(Long salaryPM) {
		this.salaryPM = salaryPM;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	private String name;
	private int id;
	private Long salaryPM;
	private String department;
	private int tax;
	public Employee(String name, int id, Long salaryPM, String department) {
		super();
		this.name = name;
		this.id = id;
		this.salaryPM = salaryPM;
		this.department = department;
	}

}
