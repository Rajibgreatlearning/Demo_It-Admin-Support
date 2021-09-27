package com.employeeDetails.java;

import java.util.Scanner;

public class employee {

	public static Scanner sc = new Scanner(System.in);
	private static String firstName;
	private static String LastName;
	private static String companyName;

	public void employeeDetails() {
		System.out.println("Please enter the first name:");
		setFirstName(sc.next());

		System.out.println("Please enter the last name:");
		setLastName(sc.next());

		System.out.println("Please enter your company: ");
		setCompanyName(sc.next());

	}

	public String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		employee.firstName = firstName;
	}

	public  String getLastName() {
		return LastName;
	}

	public static void setLastName(String lastName) {
		LastName = lastName;
	}

	public  String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		employee.companyName = companyName;
	}

}
