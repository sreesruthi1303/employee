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
	 * @throws Exception 
		
	 */

	@Override
	public Employee postEmployee(Employee emp) throws Exception {
		List<Employee> emp1 = dao.postEmployeeDetails(emp);
		for (Employee employee : emp1) {
			calculateEmployeeTax(employee);
			System.out.println(employee.getName() + " Salary " + employee.getSalaryFinalPA() + " Tax % " + employee.getTax());
		}
		return emp;
	}
	
	private Employee calculateEmployeeTax(Employee emp) throws Exception {
		double sal = emp.getSalaryPM() * 12;
		double firstPartofTheSalary = sal - 250000;
		double secondPartofTheSalary = firstPartofTheSalary - 500000;
		double thirdPartofTheSalary = secondPartofTheSalary - 1500000;
		System.out.println("sal " + sal);
		System.out.println("firstPartofTheSalary " + firstPartofTheSalary);
		System.out.println("secondPartofTheSalary " + secondPartofTheSalary);
		System.out.println("thirdPartofTheSalary " + thirdPartofTheSalary);
		if (emp.getSalaryPM() == 0) {
			throw new Exception("Cannot calculate the salary as the salary column is empty");
		} else if (firstPartofTheSalary > 0 && (firstPartofTheSalary <= 250000)) {
			emp.setSalaryFinalPA(sal);
			emp.setTax(0);
			System.out.println(
					"Employee2 " + emp.getName() + " Salary " + emp.getSalaryFinalPA() + " Tax % " + emp.getTax());
		} else if (firstPartofTheSalary > 0 && (firstPartofTheSalary > 250000 && firstPartofTheSalary <= 500000)) {
			emp.setSalaryFinalPA(sal - (0.05 * sal));
			emp.setTax(5);
			System.out.println(
					"Employee2 " + emp.getName() + " Salary " + emp.getSalaryFinalPA() + " Tax % " + emp.getTax());
		} else if (secondPartofTheSalary > 0
				&& (secondPartofTheSalary > 500000 && secondPartofTheSalary <= 1500000)) {
			emp.setSalaryFinalPA(sal - (0.10 * sal));
			emp.setTax(10);
			System.out.println(
					"Employee3 " + emp.getName() + " Salary " + emp.getSalaryFinalPA() + " Tax % " + emp.getTax());
		} else if (thirdPartofTheSalary > 0 && (thirdPartofTheSalary > 1500000)) {
			emp.setSalaryFinalPA(sal - (0.15 * sal));
			emp.setTax(15);
			System.out.println(
					"Employee4 " + emp.getName() + " Salary " + emp.getSalaryFinalPA() + " Tax % " + emp.getTax());
		}
		return emp;
	}
	
}
