package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.model.Employee;
import com.example.SpringBoot1.repository.EmployeeRepository;
import com.example.SpringBoot1.services.EmployeeServices;
import com.example.SpringBoot1.servicesImp.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@AllArgsConstructor
@ExtendWith(MockitoExtension.class)
class EmployeeControllerTest {

    @Mock
    private EmployeeRepository emp_repo;
    private final Employee employee;
    private final EmployeeServices employeeServices;




    @Test
    void saveUser(){

    }

    @Test
    void getAll() {


    }

    @Test
    void getDataById() {
    }

    @Test
    void editData() {
    }

    @Test
    void deleteData() {
    }
}