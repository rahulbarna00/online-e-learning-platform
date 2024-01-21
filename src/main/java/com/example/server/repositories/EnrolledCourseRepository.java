package com.example.server.repositories;

import com.example.server.model.Course;
import com.example.server.model.EnrolledCourse;
import com.example.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrolledCourseRepository extends JpaRepository<EnrolledCourse, Long> {
    List<EnrolledCourse> findByUserId(Long userId);
    EnrolledCourse save(EnrolledCourse enrolledCourse);

    boolean existsByUserAndCourse(User user, Course course);
}
