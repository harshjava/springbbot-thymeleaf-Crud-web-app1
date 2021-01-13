package com.service;

import java.util.List;

import com.model.Employee;
import com.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List <Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}