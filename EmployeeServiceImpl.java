package com.Nisarga.first_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nisarga.first_api.model.Employee;
import com.Nisarga.first_api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
	    return employeeRepository.findAll();
	}
	
}