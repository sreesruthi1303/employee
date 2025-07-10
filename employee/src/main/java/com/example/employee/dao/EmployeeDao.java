package com.example.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.employee.dto.Employee;

@Repository
public class EmployeeDao {
	
	public List<Employee> postEmployeeDetails(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee("Abc1", 1, 250000L, "development");
		Employee emp2 = new Employee("Abc2", 2, 550000L, "HR");
		Employee emp3 = new Employee("Abc3", 3, 850000L, "Management");
		Employee emp4 = new Employee("Abc4", 4, 1600000L, "IT Securities");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		return empList;
		
	}

}
