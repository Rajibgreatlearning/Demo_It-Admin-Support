package com.main.java;

import java.util.Scanner;

import com.employeeDetails.java.employee;
import com.service.com.generateEmail;

public class driver {

	public static employee e = new employee();
	public static generateEmail ge = new generateEmail();

	public static void main(String[] args) {
		System.out.println("Hello! Please enter the details");

		e.employeeDetails();
		ge.EmailGenerate();

	}

}
