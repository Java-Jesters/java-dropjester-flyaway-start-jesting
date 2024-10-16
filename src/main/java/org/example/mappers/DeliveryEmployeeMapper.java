package org.example.mappers;

import org.example.models.DeliveryEmployee;
import org.example.models.DeliveryEmployeeResponse;

import java.util.List;
import java.util.stream.Collectors;

public final class DeliveryEmployeeMapper {
    private DeliveryEmployeeMapper() { }

    public static DeliveryEmployeeResponse mapToResponse(
            final DeliveryEmployee deliveryEmployee) {
        return new DeliveryEmployeeResponse(
                deliveryEmployee.getEmployeeId(),
                deliveryEmployee.getName(),
                deliveryEmployee.getSalary(),
                deliveryEmployee.getBankAccountNumber(),
                deliveryEmployee.getNationalInsuranceNumber()
        );
    }

    public static List<DeliveryEmployeeResponse> mapToResponseList(
            final List<DeliveryEmployee> deliveryEmployees
    ) {
        return deliveryEmployees.stream()
                .map(DeliveryEmployeeMapper::mapToResponse)
                .collect(Collectors.toList());
    }
}
