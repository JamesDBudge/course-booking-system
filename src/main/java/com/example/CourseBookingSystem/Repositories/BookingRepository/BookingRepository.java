package com.example.CourseBookingSystem.Repositories.BookingRepository;

import com.example.CourseBookingSystem.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingsByDate(String Date);
}
