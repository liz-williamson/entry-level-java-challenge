package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import org.springframework.stereotype.Service;

import java.util.*;

@Service

// implements the service layer interface
public class EmployeeServiceImpl implements EmployeeService {
    // create a hashmap to allow Employee search by uuid
    private final Map<UUID, Employee> employees = new HashMap<>();

    @Override
    // create a list with all the Employees in the hashmap
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @Override
    // returns the employee w/ corresponding uuid
    public Employee getEmployeeByUuid(UUID uuid) {
        return employees.get(uuid);
    }

    @Override
    // creates an Employee & adds to hashmap
    public Employee createEmployee(EmployeeImpl employee) {
        employees.put(employee.getUuid(), employee);
        return employee;
    }

    public static void main(String[] args) {}
}
