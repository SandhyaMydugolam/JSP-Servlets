package com.employeeapp.service;

public class Employee {

private String employeeName;
private int employeeId;
private double employeeSalary;
private String employeeCity;
public Employee() {
	super();
}
public Employee(String employeeName, int employeeId, double employeeSalary, String employeeCity) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.employeeSalary = employeeSalary;
	this.employeeCity = employeeCity;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public double getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(double employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeCity() {
	return employeeCity;
}
public void setEmployeeCity(String employeeCity) {
	this.employeeCity = employeeCity;
}
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
			+ employeeSalary + ", employeeCity=" + employeeCity + "]";
}

}
