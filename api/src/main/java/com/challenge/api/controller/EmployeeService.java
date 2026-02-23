package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import java.util.List;
import java.util.UUID;

// interface for service layer
public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeByUuid(UUID uuid);

    Employee createEmployee(EmployeeImpl employee);
}
