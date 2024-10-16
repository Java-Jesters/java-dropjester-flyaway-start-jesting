package org.example.models;

public class DeliveryEmployee extends Employee {
    public DeliveryEmployee(final int employeeId, final String name,
                            final double salary, final String bankAccountNumber,
                            final String nationalInsuranceNumber) {
        super(employeeId, name, salary, bankAccountNumber,
                nationalInsuranceNumber);
    }
}