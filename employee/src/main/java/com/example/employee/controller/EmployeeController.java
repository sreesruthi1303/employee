package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.employee.dto.Employee;
import com.example.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping(path = "/postEmployeeDetails")
	public Employee insertEmployeeDetails(Employee employee) {
		return service.postEmployee(employee);
	}

}
