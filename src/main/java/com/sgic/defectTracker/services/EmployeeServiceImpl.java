package com.sgic.defectTracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.defectTracker.entities.Employee;
import com.sgic.defectTracker.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository; // Create EmployeeRepository Object

	@Override
	public Employee saveEmployee(Employee employee) { // Implementation for SaveEmployee method
		return employeeRepository.save(employee); // Call the save method from JPARepository
	}

	@Override
	public List<Employee> listEmployeeInfo() {// Implementation for ListEmployee method
		return employeeRepository.findAll(); // Call the findAll method from JPARepository
	}

	@Override
	public Employee getEmployeeById(String employeeId) { // Implementation for getEmployee By Id method
		return employeeRepository.findEmployeeByEmployeeId(employeeId); // Call the findByEmployeeId method from JPARepository 
	}
	
}
