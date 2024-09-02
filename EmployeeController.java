package com.Nisarga.first_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.Nisarga.first_api.service.EmployeeService;

import org.springframework.ui.Model;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	// display list of employees
	@GetMapping ("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "index";
	}

}


