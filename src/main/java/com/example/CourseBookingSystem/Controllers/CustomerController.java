package com.example.CourseBookingSystem.Controllers;


import com.example.CourseBookingSystem.Models.Customer;
import com.example.CourseBookingSystem.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/{town}&{course}")
    public List<Customer> findCustomersByTownAndBookings_CourseName(@PathVariable String town, @PathVariable String course) {
        return customerRepository.findCustomersByTownAndBookings_CourseName(town, course);
    }


    @GetMapping(value = "/{age}/{town}/{course}")
    public List<Customer> findCustomersByAgeGreaterThanAndTownAndBookings_CourseName(@PathVariable int age, @PathVariable String town, @PathVariable String course) {
        return customerRepository.findCustomersByAgeGreaterThanAndTownAndBookings_CourseName(age, town, course);
    }
}
