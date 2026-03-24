package com.example.hr.service.impl;

import com.example.hr.controller.request.EmployeeRequest;
import com.example.hr.model.Employee;
import com.example.hr.repository.EmployeeRepository;
import com.example.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void create(EmployeeRequest employeeRequest) {
//        System.out.println(employeeRequest.getName());
//        System.out.println(employeeRequest.getEmail());

        Employee employee = new Employee();
        employee.setId(employeeRequest.getId());
        employee.setEmail(employeeRequest.getEmail());

        employeeRepository.createEmployee(employee);



    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
