package org.example.mappers;

import org.example.models.DeliveryEmployee;
import org.example.models.DeliveryEmployeeResponse;

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
}
