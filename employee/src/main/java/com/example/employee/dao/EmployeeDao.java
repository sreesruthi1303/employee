package com.example.employee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.employee.dto.Employee;

@Repository
public class EmployeeDao {
	
	public List<Employee> postEmployeeDetails(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		Employee emp1 = new Employee("Abc1", 1, 21000.0, "development");
		Employee emp2 = new Employee("Abc2", 2, 47000.0, "HR");
		Employee emp3 = new Employee("Abc3", 3, 72000.0, "Management");
		Employee emp4 = new Employee("Abc4", 4, 133000.0, "IT Securities");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		return empList;
		
	}

}
