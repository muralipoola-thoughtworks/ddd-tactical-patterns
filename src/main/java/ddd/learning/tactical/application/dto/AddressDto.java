package ddd.learning.tactical.application.dto;

import ddd.learning.tactical.framework.ValueObject;

import java.util.Objects;

public class AddressDto {
    private String street1;
    private String street2;
    private String city;
    private String pinCode;

    public String getStreet1() {
        return street1;
    }

    public String getStreet2() {
        return street2;
    }

    public String getCity() {
        return city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public AddressDto(String street1, String street2, String city, String pinCode) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDto address = (AddressDto) o;
        return Objects.equals(street1, address.street1) && Objects.equals(street2, address.street2) && Objects.equals(city, address.city) && Objects.equals(pinCode, address.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street1, street2, city, pinCode);
    }
}
