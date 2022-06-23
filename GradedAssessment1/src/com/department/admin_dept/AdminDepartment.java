package com.department.admin_dept;

import com.department.super_dept.SuperDepartment;

//this class inherites Super Department super class 
public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return ("Admin Department");
	} 

	public String getTodaysWork() {
		return ("Complete your documents Submission");
	}  

	public String getWorkDeadline() {
		return ("Complete by EOD ");
	}

}
