package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.dto.Employee;

@Service
public class EmployeeService implements EmployeeInterface {
	
	@Autowired
	EmployeeDao dao;
	
	/**
	 * 	0-250000 - 5%
	 * 	750000 - (250000 + 500000)
	 *             5 + 10
		2500000-500000 - 10%
		500000-1500000 - 15%
		
	 */

	@Override
	public Employee postEmployee(Employee emp) {
		List<Employee> emp1 = dao.postEmployeeDetails(emp);
		for (Employee employee : emp) {
			emp.setTax(calculateEmployeeTax(emp));
		}
		return emp1;
	}
	
	private void calculateTax(int salary) {
		if(salary > )
	}

	private int calculateEmployeeTax(Employee emp) throws Exception {
		if(emp.getSalaryPM() == 0) {
			throw new Exception("Cannot calculate the salary as the salary column is empty");
		} else if (emp.getSalaryPM() > 0 && emp.getSalaryPM() <= 250000) {
			System.out.println("5 percent");
			return 5;
		} else if (emp.getSalaryPM() > 250000 && emp.getSalaryPM() <= 500000) {
			/* 5% + calculateTax(sal - 250000)) */
			System.out.println("10 percent");
			return 10;
		} else if (emp.getSalaryPM() > 500000 && emp.getSalaryPM() <= 1500000) {
			/* 5% + calculateTax(sal = sal - 250000)) */
			/* 10% + calculateTax(sal = sal - 500000) */
			/* 15% + calculateTax(sal = sal - 
			System.out.println("15 percent");
			return 15;
		}
		return 0;
}
	
}
