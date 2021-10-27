package ddd.learning.tactical.domain.model.Employee;

import ddd.learning.tactical.framework.AbstractDomainEvent;

public class EmployeeAddressAdded extends AbstractDomainEvent<EmployeeId> implements EmployeeEvent {
    private EmployeeId employeeId;
    private Address address;

    public EmployeeAddressAdded(EmployeeId employeeId, Address address) {
        super(employeeId);
        this.employeeId = employeeId;
        this.address = address;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeAddressAdded{" +
                "employeeId=" + employeeId +
                ", address=" + address +
                '}';
    }
}
