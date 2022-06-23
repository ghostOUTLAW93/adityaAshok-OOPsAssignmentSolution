package com.department.main;

import com.department.admin_dept.AdminDepartment;
import com.department.hr_dept.HrDepartment;
import com.department.tech_dept.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {

		//creating object of Admin Department referring to same class
		//creating object of HR Department referring to same class
		//creating object of Tech Department referring to same class
		
		AdminDepartment adminObj = new AdminDepartment();
		HrDepartment hrObj = new HrDepartment();
		TechDepartment techObj = new TechDepartment();

		System.out.println("Welcome to "+adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());

		System.out.println("\nWelcome to "+hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());

		System.out.println("\nWelcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());

	}
	
}
