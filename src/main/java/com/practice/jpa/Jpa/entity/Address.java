package com.practice.jpa.Jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String state;

    // Many addresses belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Many-to-Many with Student
    @ManyToMany(mappedBy = "addresses")
    private List<Student> students = new ArrayList<>();
}
