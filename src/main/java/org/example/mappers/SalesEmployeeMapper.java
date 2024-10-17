package org.example.mappers;

import org.example.models.SalesEmployee;
import org.example.models.SalesEmployeeResponse;

import java.util.List;
import java.util.stream.Collectors;

public final class SalesEmployeeMapper {
    private SalesEmployeeMapper() { }

    public static List<SalesEmployeeResponse> toSalesEmployeeResponseList(
            final List<SalesEmployee> salesEmployees) {
        return salesEmployees.stream()
                .map(salesEmployee -> new SalesEmployeeResponse(
                        salesEmployee.getEmployeeId(),
                        salesEmployee.getName(),
                        salesEmployee.getSalary(),
                        salesEmployee.getBankAccountNumber(),
                        salesEmployee.getNationalInsuranceNumber()))
                .collect(Collectors.toList());
    }
}
