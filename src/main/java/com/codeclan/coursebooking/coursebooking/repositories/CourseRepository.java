package com.codeclan.coursebooking.coursebooking.repositories;

import com.codeclan.coursebooking.coursebooking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
