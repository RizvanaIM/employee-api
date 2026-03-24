package com.example.hr.service;

import com.example.hr.controller.request.EmployeeRequest;
import com.example.hr.controller.response.EmployeeResponse;
import com.example.hr.model.Employee;

import java.util.List;

public interface EmployeeService {

    void create (EmployeeRequest employeeRequest);

    List<Employee> findAll ();
}
