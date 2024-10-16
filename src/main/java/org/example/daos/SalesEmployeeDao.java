package org.example.daos;

import org.example.models.SalesEmployee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalesEmployeeDao {

    public List<SalesEmployee> getAllSalesEmployees() throws SQLException {
        List<SalesEmployee> salesEmployees = new ArrayList<>();

        try (Connection connection = DatabaseConnector.getConnection()) {
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "SELECT DISTINCT "
                            +
                            "Employee.employeeId, "
                            +
                            "firstName, "
                            +
                            "lastName, "
                            +
                            "salary, "
                            +
                            "bankAccountNumber, "
                            +
                            "nationalInsuranceNumber, "
                            +
                            "SalesEmployee.commissionRate "
                            +
                            "FROM Employee INNER JOIN SalesEmployee "
                            +
                            "WHERE Employee.employeeId IN "
                            +
                            "(SELECT SalesEmployee.employeeId "
                            +
                            "FROM SalesEmployee)"
            );

            while (resultSet.next()) {
                SalesEmployee salesEmployee = new SalesEmployee(
                        resultSet.getInt("employeeId"),
                        resultSet.getString("firstName") + " "
                        + resultSet.getString("lastName"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("bankAccountNumber"),
                        resultSet.getString("nationalInsuranceNumber"),
                        resultSet.getDouble("commissionRate"));
                salesEmployees.add(salesEmployee);
            }
        }
        return salesEmployees;
    }
}
