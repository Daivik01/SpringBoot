package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.model.Employee;
import com.example.SpringBoot1.services.EmployeeServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeServices employeeServices;


    @PostMapping()
    public Employee saveUser(@Valid @RequestBody Employee employee) {
        return employeeServices.saveEmployee(employee);
    }

    @GetMapping()
    public List<Employee> getAll() {
        return employeeServices.listAll();
    }

    @GetMapping("{id}")
    public Employee getDataById(@PathVariable("id") Long id) {
        return employeeServices.getEmployeeById(id);
    }

    @PutMapping(value = "{id}")
    public Employee editData(@PathVariable("id") Long id,@RequestBody Employee employee) {
        return employeeServices.updateUser(id,employee);
    }

    @DeleteMapping("{id}")
    public String deleteData(@PathVariable("id") Long id) {
        employeeServices.DeleteUser(id);
        return "Successfully Deleted";
    }
}
