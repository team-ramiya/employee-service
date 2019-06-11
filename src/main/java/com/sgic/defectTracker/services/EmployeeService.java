package com.sgic.defectTracker.services;

import java.util.List;

import com.sgic.defectTracker.entities.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee); // Save method for Employee Entity

	List<Employee> listEmployeeInfo(); // Method for Employee List
	
	Employee getEmployeeById(String employeeId); // method for Getting One Employee Record
	
//	Employee deleteEmployeeById()
}
