package org.example.models;

public class ClientAddress {
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressProvince;
    private String addressRegion;
    private String addressCountry;
    private String postalCode;

    public ClientAddress(final String addressLine1,
                         final String addressLine2,
                         final String addressCity,
                         final String addressProvince,
                         final String addressRegion,
                         final String addressCountry,
                         final String postalCode
    ) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressProvince = addressProvince;
        this.addressRegion = addressRegion;
        this.addressCountry = addressCountry;
        this.postalCode = postalCode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(final String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(final String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(final String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(final String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(final String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(final String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }
}
