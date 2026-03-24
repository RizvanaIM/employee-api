package com.example.hr.controller;

import com.example.hr.controller.request.EmployeeRequest;
import com.example.hr.controller.response.EmployeeResponse;
import com.example.hr.model.Employee;
import com.example.hr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public void create (@RequestBody EmployeeRequest employeeRequest) {
//      System.out.println(employeeRequest.getName());
//        System.out.println();
        employeeService.create(employeeRequest);

    }

    @GetMapping("/employee")
    public List<EmployeeResponse> findALl () {

        List<Employee> employeeList = employeeService.findAll();
        List<EmployeeResponse> employeeResponseList = new ArrayList<>();

        for (Employee employee : employeeList) {
            EmployeeResponse employeeResponse = new EmployeeResponse();
            employeeResponse.setId(employee.getId());
            employeeResponse.setEmail(employee.getEmail());

            employeeResponseList.add(employeeResponse);

        }

        return employeeResponseList;
    }

}
