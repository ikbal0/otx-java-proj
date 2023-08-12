package com.devyad.otx.services;

import java.util.List;

import com.devyad.otx.models.Employee;

public interface EmployeeService {
    Employee savEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}
