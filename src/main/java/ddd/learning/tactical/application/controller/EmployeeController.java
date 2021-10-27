package ddd.learning.tactical.application.controller;

import ddd.learning.tactical.application.dto.EmployeeDto;
import ddd.learning.tactical.domain.model.Employee.EmployeeId;
import ddd.learning.tactical.application.service.EmployeeService;

public class EmployeeController {

    public EmployeeId Create(EmployeeDto employeeDto) {
        EmployeeService employeeService = new EmployeeService();
        EmployeeId employeeId = employeeService.createEmployee(employeeDto);
        return employeeId;
    }

}
