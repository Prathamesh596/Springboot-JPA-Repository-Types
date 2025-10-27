package com.practice.jpa.Jpa.repository;

import com.practice.jpa.Jpa.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
