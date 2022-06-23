package com.department.tech_dept;

import com.department.super_dept.SuperDepartment;

//this class inherits Super Department super class 
public class TechDepartment extends SuperDepartment {

	public String  departmentName() {
		return ("Tech Department ");
	} 

	public String  getTodaysWork() {
		return ("Complete coding of module 1");
	}  

	public String getWorkDeadline() {
		return ("Complete by EOD ");
	}

	public String getTechStackInformation() {
		return ("Core Java");
	}

}
