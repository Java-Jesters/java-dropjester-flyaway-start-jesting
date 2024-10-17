package org.example.models;

public class SalesEmployeeResponse {

    private final int employeeId;
    private final String name;
    private final double salary;
    private final String bankAccountNumber;
    private final String nationalInsuranceNumber;

    public SalesEmployeeResponse(final int employeeId,
                                 final String name,
                                 final double salary,
                                 final String bankAccountNumber,
                                 final String nationalInsuranceNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bankAccountNumber = bankAccountNumber;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}
