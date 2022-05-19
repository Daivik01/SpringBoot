package com.example.SpringBoot1.services;

import com.example.SpringBoot1.model.Employee;

import java.util.List;

public interface EmployeeServices {
    Employee saveEmployee(Employee employee);
    List<Employee> listAll();
    Employee getEmployeeById(long id);
    Employee updateUser(long id);
    void DeleteUser(long id);
}
