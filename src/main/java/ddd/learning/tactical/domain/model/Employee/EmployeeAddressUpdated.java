package ddd.learning.tactical.domain.model.Employee;

import ddd.learning.tactical.framework.AbstractDomainEvent;

public class EmployeeAddressUpdated extends AbstractDomainEvent<EmployeeId> implements EmployeeEvent {

    private String street1;
    private String street2;
    private String city;
    private String pinCode;

    public EmployeeAddressUpdated(EmployeeId id, String street1, String street2, String city, String pinCode) {
        super(id);
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.pinCode = pinCode;
    }

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

    @Override
    public String toString() {
        return "AddressUpdated{" +
                "street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
