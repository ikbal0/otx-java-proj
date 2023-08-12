package com.devyad.otx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devyad.otx.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
