package com.practice.jpa.Jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Many-to-One with User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // One-to-Many with Laptop
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Laptop> laptops = new ArrayList<>();

    // Many-to-Many with Address
    @ManyToMany
    @JoinTable(
            name = "student_address",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private List<Address> addresses = new ArrayList<>();
}
