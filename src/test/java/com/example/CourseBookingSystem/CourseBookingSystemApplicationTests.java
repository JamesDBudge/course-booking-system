package com.example.CourseBookingSystem;

import com.example.CourseBookingSystem.Repositories.BookingRepository.BookingRepository;
import com.example.CourseBookingSystem.Repositories.CourseRepository.CourseRepository;
import com.example.CourseBookingSystem.Repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingSystemApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void yo() {

	}
}
