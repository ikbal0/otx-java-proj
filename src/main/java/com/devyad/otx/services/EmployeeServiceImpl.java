package com.devyad.otx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devyad.otx.exceptions.ResourceNotFoundException;
import com.devyad.otx.models.Employee;
import com.devyad.otx.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Employee", "Id", id));
        employeeRepository.deleteById(id);
        
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Employee", "Id", id));
    }

    @Override
    public Employee savEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {

        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(() -> 
            new ResourceNotFoundException("Employee", "Id", id));
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }
    
}
