package org.example.daos;

import org.example.models.Client;
import org.example.models.ClientAddress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {
    public Client getClientById(final int id)
            throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query =
                    "SELECT "
                            + "clientId, "
                            + "name, "
                            + "phoneNumber, "
                            + "addressLine1, "
                            + "addressLine2, "
                            + "addressCity, "
                            + "addressProvince, "
                            + "addressRegion, "
                            + "addressCountry, "
                            + "postalCode "
                            + "FROM Client "
                            + "WHERE clientId = ?;";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return new Client(
                        resultSet.getInt("clientId"),
                        resultSet.getString("name"),
                        resultSet.getString("phoneNumber"),
                        new ClientAddress(
                                resultSet.getString("addressLine1"),
                                resultSet.getString("addressLine2"),
                                resultSet.getString("addressCity"),
                                resultSet.getString("addressProvince"),
                                resultSet.getString("addressRegion"),
                                resultSet.getString("addressCountry"),
                                resultSet.getString("postalCode")
                        )
                    );
            }
        }

        return null;
    }

    public List<Client> getAllClients()
            throws SQLException {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query =
                    "SELECT "
                            + "clientId, "
                            + "name, "
                            + "phoneNumber, "
                            + "addressLine1, "
                            + "addressLine2, "
                            + "addressCity, "
                            + "addressProvince, "
                            + "addressRegion, "
                            + "addressCountry, "
                            + "postalCode "
                            + "FROM Client;";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Client> clients
                    = new ArrayList<>();

            while (resultSet.next()) {
                clients.add(new Client(
                        resultSet.getInt("clientId"),
                        resultSet.getString("name"),
                        resultSet.getString("phoneNumber"),
                        new ClientAddress(
                                resultSet.getString("addressLine1"),
                                resultSet.getString("addressLine2"),
                                resultSet.getString("addressCity"),
                                resultSet.getString("addressProvince"),
                                resultSet.getString("addressRegion"),
                                resultSet.getString("addressCountry"),
                                resultSet.getString("postalCode")
                        )
                ));
            }

            return clients;
        }
    }
}
