package com.thoughtworks.springbootemployee.controller;

public class Employee {
    private Long id;
    private String employeeName;
    private Integer employeeAge;
    private String employeeGender;
    private Integer employeeSalary;
    private Long companyId;

    public Employee(Long id, String name, Integer age, String gender, Integer salary, Long companyId) {
        this.id = id;
        this.employeeName = name;
        this.employeeAge = age;
        this.employeeGender = gender;
        this.employeeSalary = salary;
        this.companyId = companyId;
    }

    public Long getEmployeeId() {
        return id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Integer getEmployeeAge() {
        return employeeAge;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public Long getCompanyId() {
        return companyId;
    }
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setEmployeeAge(Integer age) {
        this.employeeAge = age;
    }

    public void setEmployeeGender(String gender) {
        this.employeeGender = gender;
    }

    public void setEmployeeSalary(Integer salary) {
        this.employeeSalary = salary;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setId(Long id) {this.id = id;}

}
