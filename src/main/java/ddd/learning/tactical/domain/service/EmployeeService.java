package ddd.learning.tactical.domain.service;

import ddd.learning.tactical.application.dto.EmployeeDto;
import ddd.learning.tactical.domain.model.Employee.Address;
import ddd.learning.tactical.domain.model.Employee.Employee;
import ddd.learning.tactical.domain.model.Employee.EmployeeId;
import ddd.learning.tactical.application.repository.EmployeeRepository;

public class EmployeeService {

    public void createEmployee(EmployeeDto employeeDto) {
        EmployeeId employeeId = new EmployeeId(IdentityService.getNextId());
        Employee employee = new Employee(employeeId,
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getDepartment());

        employee.addAddress(new Address(employeeDto.getAddress().getStreet1(),
                employeeDto.getAddress().getStreet2(),
                employeeDto.getAddress().getCity(),
                employeeDto.getAddress().getPinCode()));

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.Save(employee);
    }
}














