package com.practice.jpa.Jpa;

import com.practice.jpa.Jpa.entity.Address;
import com.practice.jpa.Jpa.entity.Laptop;
import com.practice.jpa.Jpa.entity.Student;
import com.practice.jpa.Jpa.entity.User;
import com.practice.jpa.Jpa.repository.AddressRepository;
import com.practice.jpa.Jpa.repository.LaptopRepository;
import com.practice.jpa.Jpa.repository.StudentRepository;
import com.practice.jpa.Jpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {

        SpringApplication.run(JpaApplication.class, args);
    }


    @Bean
    CommandLineRunner run(UserRepository userRepo, StudentRepository studentRepo,
                          LaptopRepository laptopRepo, AddressRepository addressRepo) {
        return args -> {
            // User
            User user = new User();
            user.setName("Prathamesh");

            // Address
            Address address1 = new Address();
            address1.setCity("Mumbai");
            address1.setState("Maharashtra");
            address1.setUser(user);

            // Student
            Student student = new Student();
            student.setName("Rohit");
            student.setUser(user);

            // Laptop
            Laptop laptop1 = new Laptop();
            laptop1.setBrand("Dell");
            laptop1.setModel("Inspiron 15");
            laptop1.setStudent(student);

            // Many-to-Many Link
            student.getAddresses().add(address1);
            address1.getStudents().add(student);

            // Set relationships
            student.getLaptops().add(laptop1);
            user.getAddresses().add(address1);
            user.getStudents().add(student);

            // Save everything
            userRepo.save(user);
        };
    }
}