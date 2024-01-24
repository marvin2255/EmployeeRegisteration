package com.example.employeeManagementsql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.employeeManagementsql.model.Employee;
import com.example.employeeManagementsql.repository.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}

	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	public Employee updateEmployee(int id, Employee employee) {
		
		Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
		
		employeeToUpdate.setName(employee.getName());
		employeeToUpdate.setAge(employee.getAge());
		employeeToUpdate.setPhoneNumber(employee.getPhoneNumber());
		employeeToUpdate.setDepartment(employee.getDepartment());
		
		return employeeRepository.save(employeeToUpdate);
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);

	}

}
