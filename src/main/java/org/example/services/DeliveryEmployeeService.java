package org.example.services;

import org.example.daos.DeliveryEmployeeDao;
import org.example.exceptions.DoesNotExistException;
import org.example.mappers.DeliveryEmployeeMapper;
import org.example.models.DeliveryEmployee;
import org.example.exceptions.Entity;
import org.example.models.DeliveryEmployeeResponse;

import java.sql.SQLException;
import java.util.List;

public class DeliveryEmployeeService {
    DeliveryEmployeeDao deliveryEmployeeDao;

    public DeliveryEmployeeService(
            final DeliveryEmployeeDao deliveryEmployeeDao) {
        this.deliveryEmployeeDao = deliveryEmployeeDao;
    }

    public DeliveryEmployeeResponse getDeliveryEmployeeById(final int id)
            throws SQLException, DoesNotExistException {
        DeliveryEmployee deliveryEmployee =
                deliveryEmployeeDao.getDeliveryEmployeeById(id);

        if (deliveryEmployee == null) {
            throw new DoesNotExistException(Entity.DELIVERY_EMPLOYEE);
        }

        return DeliveryEmployeeMapper.mapToResponse(deliveryEmployee);
    }

    public List<DeliveryEmployeeResponse> getDeliveryEmployees()
            throws SQLException {
        List<DeliveryEmployee> employees =
                deliveryEmployeeDao.getAllDeliveryEmployees();

        return DeliveryEmployeeMapper.mapToResponseList(employees);
    }
}
