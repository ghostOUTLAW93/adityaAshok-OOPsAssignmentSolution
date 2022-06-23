package com.department.hr_dept;

import com.department.super_dept.SuperDepartment;

//this class inherits Super Department super class 
public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		return ("HR Department ");		
	} 

	public String getTodaysWork() {
		return ("Fill today’s timesheet and mark your attendance") 	
	}  

	public String getWorkDeadline() {
		return ("Complete by EOD ")    	
	}

	public String doActivity() {
		return ("Team Lunch");
	}

}
