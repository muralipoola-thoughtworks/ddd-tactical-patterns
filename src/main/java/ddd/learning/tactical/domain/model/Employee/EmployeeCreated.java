package ddd.learning.tactical.domain.model.Employee;

import ddd.learning.tactical.framework.AbstractDomainEvent;

public class EmployeeCreated extends AbstractDomainEvent<EmployeeId> implements EmployeeEvent {

    private String firstName;
    private String lastName;
    private String department;

    public EmployeeCreated(EmployeeId employeeId, String firstName, String lastName, String department) {
        super(employeeId);

        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeCreated{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

}
