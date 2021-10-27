package ddd.learning.tactical.application.dto;

public class EmployeeDto {
    private String firstName;
    private String lastName;
    private String department;
    private AddressDto address;

    public EmployeeDto(String firstName, String lastName, String department, AddressDto address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.address = address;
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

    public AddressDto getAddress() {
        return address;
    }
}
