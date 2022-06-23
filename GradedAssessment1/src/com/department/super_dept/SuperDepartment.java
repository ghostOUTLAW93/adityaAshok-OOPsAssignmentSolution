package com.department.super_dept;

//this is super class which is extended by three classes viz
//Admin Department
//Hr Department
//Tech Department
public class SuperDepartment {

	public String departmentName() {
		return ("Super Department") ;
	} 

	public String getTodaysWork() {
		return ("No Work as of now");
	}  

	public String getWorkDeadline() {
		return ("Nil");
	}

	public String isTodayAHoliday() {
		return ("Today is not a holiday");
	}

}
