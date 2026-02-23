package com.challenge.api.controller;

import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Fill in the missing aspects of this Spring Web REST Controller. Don't forget to add a Service layer.
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    // service layer
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee models as necessary.
     * @return One or more Employees.
     */
    @GetMapping
    // return a list of all Employees
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer. Generate mock Employee model as necessary.
     * @param uuid Employee UUID
     * @return Requested Employee if exists
     */
    @GetMapping("/{uuid}")
    // returns the employee w/ corresponding uuid in the path
    public Employee getEmployeeByUuid(@PathVariable UUID uuid) {
        return employeeService.getEmployeeByUuid(uuid);
    }

    /**
     * @implNote Need not be concerned with an actual persistence layer.
     * @param employee instance of an Employee
     * @return Newly created Employee
     */
    @PostMapping
    // creates & returns an employee from JSON body
    public Employee createEmployee(@RequestBody EmployeeImpl employee) {
        return employeeService.createEmployee(employee);
    }
}
