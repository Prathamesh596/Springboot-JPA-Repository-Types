package com.practice.jpa.Jpa.repository;

import com.practice.jpa.Jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
