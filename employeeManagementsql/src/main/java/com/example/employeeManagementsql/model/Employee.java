package com.example.employeeManagementsql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private String Age;
    private String phoneNumber;
    private String department;
    

    public Employee() {
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAge() {
		return Age;
	}


	public void setAge(String age) {
		Age = age;
	}


	public String getPhoneNumber() {
		return phoneNumber;
		
	}


	public void setPhoneNumber(String phoneNo) {
		phoneNumber = phoneNo;
	}


	public String getDepartment() {
		return department;
	}


//	public void setDepartment(String department) {
//		department = department;
//	}

	public void setDepartment(String department) {
	    this.department = department;
	}

    
}