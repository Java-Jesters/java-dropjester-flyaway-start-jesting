package org.example.models;

public class Employee {
	private int employeeId;
	private String name;
	private double salary;
	private String bankAccountNumber;
	private String nationalInsuranceNumber;

	public Employee(int employeeId, String name, double salary,
					String bankAccountNumber, String nationalInsuranceNumber) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.bankAccountNumber = bankAccountNumber;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}

	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
}
