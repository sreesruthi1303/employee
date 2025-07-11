package com.example.employee.dto;

public class Employee {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalaryPM() {
		return salaryPM;
	}
	public void setSalaryPM(Double salaryPM) {
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
	private Integer empId;
	private Double salaryPM;
	private String department;
	private int tax;
	private double salaryFinalPA;
	
	public Employee(String name, Integer empId, Double salaryPM, String department) {
		super();
		this.name = name;
		this.setEmpId(empId);
		this.salaryPM = salaryPM;
		this.department = department;
	}
	public Double getSalaryFinalPA() {
		return salaryFinalPA;
	}
	public void setSalaryFinalPA(Double salaryFinalPA) {
		this.salaryFinalPA = salaryFinalPA;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
