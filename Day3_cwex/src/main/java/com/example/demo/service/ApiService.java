package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepo er;
	
	public Employee saveinfo(Employee ee)
	{
		return er.save(ee);
	}
	public List<Employee> showinfo()
	{
		return er.findAll(); 
	}
	
	

}
