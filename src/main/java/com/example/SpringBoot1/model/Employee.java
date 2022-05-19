package com.example.SpringBoot1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Size(min = 2,message = "name should have at least 2 characters")
    private String name;

    @NotEmpty
    @Email(message = "Not a valid email")
    private String email;

    @NotEmpty
    @Size(min = 2,message = "name should have at least 2 characters" )
    private String city;


}
