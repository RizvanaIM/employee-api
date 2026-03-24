package com.example.hr.repository;

import com.example.hr.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> EmployeeList = new ArrayList<>();

    public void createEmployee (Employee employee){
        EmployeeList.add(employee);
    }

     public List<Employee> findAll (){
        return EmployeeList;
     }

}
