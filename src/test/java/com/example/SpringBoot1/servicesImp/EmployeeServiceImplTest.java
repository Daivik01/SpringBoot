package com.example.SpringBoot1.servicesImp;

import com.example.SpringBoot1.model.Employee;
import com.example.SpringBoot1.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
@AllArgsConstructor
class EmployeeServiceImplTest {

    @Mock
    EmployeeRepository repo;

    @InjectMocks
    EmployeeServiceImpl employeeService;


//    @BeforeEach
//    public void setUp() {
//        employee = new Employee(1, "Daivik", "email@gmail.com", "city");
//
//    }
//
//    @AfterEach
//    public void tearDown() {
//        emprepo.deleteAll();
//        employee = null;
//    }
//
//    @Test
//    void saveEmployee() {
//        emprepo.save(employee);
//        emprepo.findById(employee.getId()).ifPresent(fetchEmployee -> assertEquals(1, fetchEmployee.getId()));
//    }


//    @Test
//    void getEmployeeById() {
//        Employee employees = emprepo.findById(1L).orElse(null);
//        assert employees != null;
//        Assertions.assertThat(employees.getId()).isEqualTo(1L);
//    }

    @Test
    @Order(1)
    void listAll() {
        List<Employee> myListEmployees = new ArrayList<>();
        myListEmployees.add(new Employee(1,"Daivik","email@gmailc.om","city"));
        myListEmployees.add(new Employee(2,"Daivik","email@gmail.com","city2"));
        when(repo.findAll()).thenReturn(myListEmployees);
        assertEquals(2,employeeService.listAll().size());
    }

    @Test
    void updateUser() {

    }

    @Test
    void deleteUser() {
    }
}