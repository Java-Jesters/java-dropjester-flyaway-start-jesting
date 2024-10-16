package org.example.daos;

import org.example.models.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryEmployeeDao {
    public Employee getEmployeeById(final int id) throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query =
                    "SELECT "
                            + "employeeId, "
                            + "firstName,"
                            + "lastName, "
                            + "salary, "
                            + "bankAccountNumber, "
                            + "nationalInsuranceNumber, "
                            + "FROM Employee "
                            + "INNER JOIN DeliveryEmployee "
                            + "ON Employee.employeeId = "
                            + "DeliveryEmployee.employeeId "
                            + "where employeeId =?;";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new Employee(
                        resultSet.getInt("employeeId"),
                        resultSet.getString("firstName") + " "
                                + resultSet.getString("lastName"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("bankAccountNumber"),
                        resultSet.getString("national"
                                + "InsuranceNumber")
                        );
            }
        }

        return null;
    }
}
