package ddd.learning.anemic.service;

import ddd.learning.anemic.model.Employee;

public class EmployeeService {
    public boolean isValid(Employee employee) {
        if (employee.getDepartment().length() < 3) {
            return false;
        }
        return true;
    }
}
