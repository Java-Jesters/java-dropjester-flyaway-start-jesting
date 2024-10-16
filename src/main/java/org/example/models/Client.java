package org.example.models;

public class Client {
    private int clientId;
    private String name;
    private String phoneNumber;
    private ClientAddress clientAddress;

    public Client(final int clientId,
                  final String name,
                  final String phoneNumber,
                  final ClientAddress clientAddress
    ) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.clientAddress = clientAddress;
    }

    public void setClientAddress(final ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(final int clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
