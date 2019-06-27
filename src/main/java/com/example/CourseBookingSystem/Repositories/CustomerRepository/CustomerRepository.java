package com.example.CourseBookingSystem.Repositories.CustomerRepository;

import com.example.CourseBookingSystem.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> findCustomersByBookings_CourseName(String name);

    List<Customer> findCustomersByTownAndBookings_CourseName(String town, String name);

    List<Customer> findCustomersByAgeGreaterThanAndTownAndBookings_CourseName(int age, String town, String courseName);

}
