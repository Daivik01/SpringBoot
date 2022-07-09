package com.example.SpringBoot1.servicesImp;

import com.example.SpringBoot1.exception.ResponseNotFoundException;
import com.example.SpringBoot1.model.Employee;
import com.example.SpringBoot1.repository.EmployeeRepository;
import com.example.SpringBoot1.services.EmployeeServices;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//TODO : Need to rewrite Transactional annotation
@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeServices {
    private final EmployeeRepository repo;


    public EmployeeServiceImpl(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Transactional
    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public List<Employee> listAll() {
        return repo.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        return repo.findById(id).orElseThrow(() -> new ResponseNotFoundException("Employee", "id", id));
    }

    //Truth of search
    @Transactional
    @Override
    public Employee updateUser(long id,Employee employee) {
        Employee existEmployee = repo.findById(id).orElseThrow(() -> new ResponseNotFoundException("Employee", "id", id));
        existEmployee.setId(id);
        existEmployee.setName(employee.getName());
        existEmployee.setCity(employee.getCity());
        existEmployee.setEmail(employee.getEmail());
        System.out.println();
        return repo.save(existEmployee);
    }

    @Override
    public void DeleteUser(long id) {
        repo.findById(id).orElseThrow(() -> new ResponseNotFoundException("Employee", "id", id));
        repo.deleteById(id);
    }

}