package com.example.CourseBookingSystem.Components;

import com.example.CourseBookingSystem.Models.Booking;
import com.example.CourseBookingSystem.Models.Course;
import com.example.CourseBookingSystem.Models.Customer;
import com.example.CourseBookingSystem.Repositories.BookingRepository.BookingRepository;
import com.example.CourseBookingSystem.Repositories.CourseRepository.CourseRepository;
import com.example.CourseBookingSystem.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("James", "Edinburgh", 33);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Stephen", "Edinburgh", 29);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Bob", "Largs", 20);
        customerRepository.save(customer3);

        Course course1 = new Course("Codeclan", "Edinburgh", 1);
        courseRepository.save(course1);

        Course course2 = new Course("Python", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Welding", "Kirkcaldy", 2);
        courseRepository.save(course3);

        Booking booking1 = new Booking("Monday", course1, customer2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("Next Thursday", course2, customer3);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("Last Week", course3, customer1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("Monday", course1, customer1);
        bookingRepository.save(booking4);
    }



}
