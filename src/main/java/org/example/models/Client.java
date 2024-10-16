package org.example.models;

public class Client {
    private int clientId;
    private String name;
    private int phoneNumber;
    private ClientAddress clientAddress;

    public Client(final int clientId,
                  final String name,
                  final int phoneNumber,
                  final ClientAddress clientAddress
    ) {
        this.clientId = clientId;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClientAddressLine1() {
        return clientAddress.getAddressLine1();
    }

    public void setClientAddressLine1(final String addressLine1) {
        this.clientAddress.setAddressLine1(addressLine1);
    }

    public String getClientAddressLine2() {
        return clientAddress.getAddressLine2();
    }

    public void setClientAddressLine2(final String addressLine2) {
        this.clientAddress.setAddressLine2(addressLine2);
    }

    public String getClientAddressCity() {
        return clientAddress.getAddressCity();
    }

    public void setClientAddressCity(final String addressCity) {
        this.clientAddress.setAddressCity(addressCity);
    }

    public String getClientAddressProvince() {
        return clientAddress.getAddressProvince();
    }

    public void setClientAddressProvince(final String addressProvince) {
        this.clientAddress.setAddressProvince(addressProvince);
    }

    public String getClientAddressRegion() {
        return clientAddress.getAddressRegion();
    }

    public void setClientAddressRegion(final String addressRegion) {
        this.clientAddress.setAddressRegion(addressRegion);
    }

    public String getClientAddressCountry() {
        return clientAddress.getAddressCountry();
    }

    public void setClientAddressCountry(final String addressCountry) {
        this.clientAddress.setAddressCountry(addressCountry);
    }

    public String getClientAddressPostalCode() {
        return clientAddress.getPostalCode();
    }

    public void setClientAddressPostalCode(final String postalCode) {
        this.clientAddress.setPostalCode(postalCode);
    }
}
