package com.example.CourseBookingSystem.Repositories.CourseRepository;

import com.example.CourseBookingSystem.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByStarRating(int starRating);
    List<Course> findCoursesByBookings_CustomerName(String name);
}
