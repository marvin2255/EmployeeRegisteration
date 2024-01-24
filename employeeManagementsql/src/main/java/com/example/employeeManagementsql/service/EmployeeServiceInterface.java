package com.example.employeeManagementsql.service;

import java.util.List;
import java.util.Optional;

import com.example.employeeManagementsql.model.Employee;

public interface EmployeeServiceInterface {
	public Employee  saveEmployee(Employee employee);
	public Optional<Employee>getEmployeeById(int id);
	public List<Employee>getAllEmployee();
	public Employee updateEmployee(int id, Employee employee);
	public void deleteEmployee(int id);
	
	
	

}
