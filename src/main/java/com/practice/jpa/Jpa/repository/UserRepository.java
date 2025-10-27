package com.practice.jpa.Jpa.repository;

import com.practice.jpa.Jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
