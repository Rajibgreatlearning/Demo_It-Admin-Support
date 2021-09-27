package com.service.com;

import com.employeeDetails.java.employee;

public class generateEmail {
	public static employee e=new employee();
	public void EmailGenerate() {		
		System.out.println("The email id is: "+e.getFirstName()+e.getLastName()+"@"+e.getCompanyName()+".com.in");
	}
}
