package ddd.learning.tactical.domain.model.Employee;

import ddd.learning.tactical.framework.Identity;

public class EmployeeId extends Identity<Integer> {
    public EmployeeId(Integer id) {
        super(id);
    }

    @Override
    public String getType() {
        return "employee";
    }
}
