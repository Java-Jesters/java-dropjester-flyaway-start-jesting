package org.example.services;

import org.example.daos.SalesEmployeeDao;
import org.example.mappers.SalesEmployeeMapper;
import org.example.models.SalesEmployeeResponse;

import java.sql.SQLException;
import java.util.List;

public class SalesEmployeeService {

    SalesEmployeeDao salesEmployeeDao;

    public SalesEmployeeService(final SalesEmployeeDao salesEmployeeDao) {
        this.salesEmployeeDao = salesEmployeeDao;
    }

    public List<SalesEmployeeResponse> getAllSalesEmployees()
            throws SQLException {
        return SalesEmployeeMapper.mapSalesEmployeeListToSalesEmployeeResponseList(
                salesEmployeeDao.getAllSalesEmployees());
    }

}
