package com.challenge.api.model;

import java.time.Instant;
import java.util.UUID;

// implements abstract Employee interface
public class EmployeeImpl implements Employee {

    // instance variables
    private String firstName, lastName, fullName, jobTitle, email;
    private Integer age, salary;
    private Instant ContractHireDate, ContractTerminationDate;
    private UUID uuid;

    // no-arg constructor
    public EmployeeImpl() {}

    // setters & getters
    @Override
    public void setUuid(UUID uuid) {
        // exception for null uuid
        if (uuid == null) throw new IllegalArgumentException("uuid must be non-null");
        this.uuid = uuid;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public Integer getSalary() {
        return salary;
    }

    @Override
    public void setContractHireDate(Instant contractHireDate) {
        ContractHireDate = contractHireDate;
    }

    @Override
    public Instant getContractHireDate() {
        return ContractHireDate;
    }

    @Override
    public void setContractTerminationDate(Instant contractTerminationDate) {
        ContractTerminationDate = contractTerminationDate;
    }

    @Override
    public Instant getContractTerminationDate() {
        return ContractTerminationDate;
    }

    public static void main(String[] args) {}
}
