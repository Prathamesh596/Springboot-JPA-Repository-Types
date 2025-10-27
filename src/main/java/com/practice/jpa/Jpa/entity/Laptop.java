package com.practice.jpa.Jpa.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;

    // Many laptops belong to one student
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
