package com.empapp.model;

public class Employee {
	private String employeename;
	private Integer employeeid;
	private String city;
	private double salary;
	private String course;
	 public Employee() {
		 super();
	 }
	public Employee(String employeename, Integer employeeid, String city, double salary, String course) {
		super();
		this.employeename = employeename;
		this.employeeid = employeeid;
		this.city = city;
		this.salary = salary;
		this.course = course;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", employeeid=" + employeeid + ", city=" + city + ", salary="
				+ salary + ", course=" + course + "]";
	}
	 

}
