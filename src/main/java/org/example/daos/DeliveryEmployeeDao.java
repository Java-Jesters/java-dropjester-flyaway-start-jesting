package org.example.daos;

import org.example.models.DeliveryEmployee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeliveryEmployeeDao {
    public DeliveryEmployee getDeliveryEmployeeById(final int id)
            throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query =
                    "SELECT "
                            + "Employee.employeeId, "
                            + "firstName, "
                            + "lastName, "
                            + "salary, "
                            + "bankAccountNumber, "
                            + "nationalInsuranceNumber "
                            + "FROM Employee "
                            + "INNER JOIN DeliveryEmployee "
                            + "ON Employee.employeeId = "
                            + "DeliveryEmployee.employeeId "
                            + "WHERE Employee.employeeId = ?;";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new DeliveryEmployee(
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

    public List<DeliveryEmployee> getAllDeliveryEmployees()
            throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query =
                    "SELECT "
                            + "Employee.employeeId, "
                            + "firstName, "
                            + "lastName, "
                            + "salary, "
                            + "bankAccountNumber, "
                            + "nationalInsuranceNumber "
                            + "FROM Employee "
                            + "INNER JOIN DeliveryEmployee "
                            + "ON Employee.employeeId = "
                            + "DeliveryEmployee.employeeId;";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<DeliveryEmployee> deliveryEmployees
                    = new ArrayList<>();

            while (resultSet.next()) {
                deliveryEmployees.add(new DeliveryEmployee(
                        resultSet.getInt("employeeId"),
                        resultSet.getString("firstName") + " "
                                + resultSet.getString("lastName"),
                        resultSet.getDouble("salary"),
                        resultSet.getString("bankAccountNumber"),
                        resultSet.getString("national"
                                + "InsuranceNumber")
                ));
            }

            return deliveryEmployees;
        }
    }
}
