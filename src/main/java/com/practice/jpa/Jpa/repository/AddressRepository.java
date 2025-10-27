package com.practice.jpa.Jpa.repository;

import com.practice.jpa.Jpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
