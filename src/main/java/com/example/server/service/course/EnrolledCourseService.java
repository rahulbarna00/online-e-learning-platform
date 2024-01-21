package com.example.server.service.course;

import com.example.server.model.Course;
import com.example.server.model.EnrolledCourse;
import com.example.server.model.User;

import java.util.List;

public interface EnrolledCourseService {
    List<EnrolledCourse> getEnrolledCourseByUserId(Long userId);

    boolean isEnrolled(User user, Course course);

    void save(EnrolledCourse enrolledCourse);
}