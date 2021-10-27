package ddd.learning.tactical.domain.model.Employee;

import ddd.learning.tactical.framework.AggregateRoot;

public class Employee extends AggregateRoot<EmployeeId> {
    private String firstName;
    private String lastName;
    private String department;
    private Address address;

    public Employee(EmployeeId id) {
        super(id);
    }

    public Employee(EmployeeId id, String firstName, String lastName, String department) {
        super(id);

        this.assertArgumentNotNull(id, "EmployeeId must be provided");
        this.assertArgumentNotNull(firstName, "First name must be provided");
        this.assertArgumentNotNull(lastName, "Last name must be provided");
        this.assertArgumentNotNull(department, "Department name must be provided");

        apply(new EmployeeCreated(id, firstName, lastName, department));
    }

    public void addAddress(Address address) {
        this.assertArgumentNotNull(address.getStreet1(), "Street1 must be provided");
        this.assertArgumentNotNull(address.getCity(), "City must be provided");
        this.assertArgumentNotNull(address.getPinCode(), "Pin code must be provided");

        apply(new EmployeeAddressAdded(this.getId(), address));
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void apply(EmployeeCreated event) {
        this.firstName = event.getFirstName();
        this.lastName = event.getLastName();
        this.department = event.getDepartment();
        publish(event);
    }

    public void apply(EmployeeAddressAdded event) {
        this.address = event.getAddress();
        publish(event);
    }

    public void apply(EmployeeAddressUpdated event) {
        this.address = this.address;
    }
}
