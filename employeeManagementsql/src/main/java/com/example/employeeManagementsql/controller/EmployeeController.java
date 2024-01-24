package com.example.employeeManagementsql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.employeeManagementsql.model.Employee;
import com.example.employeeManagementsql.service.EmployeeService;

@RestController

@CrossOrigin("*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	@GetMapping("/viewEmployee")
	public List <Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	@GetMapping("/showFormForUpdate/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
	 @PutMapping("/updateEmployee/{id}")
	    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
	        return employeeService.updateEmployee(id,employee);
	    }
	 @DeleteMapping("/deleteEmployee/{id}")
	    public void deleteEmployee(@PathVariable int id){
	        employeeService.deleteEmployee(id);
	    }
}
