package org.example.models;


public class SalesEmployee extends Employee {
    private double commissionRate;

    public SalesEmployee(final int employeeId,
                         final String name,
                         final double salary,
                         final String bankAccountNumber,
                         final String nationalInsuranceNumber,
                         final double commissionRate
    ) {
        super(employeeId, name, salary, bankAccountNumber,
                nationalInsuranceNumber);
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(final double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
