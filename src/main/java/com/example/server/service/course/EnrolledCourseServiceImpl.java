package com.example.server.service.course;

import com.example.server.model.Course;
import com.example.server.model.EnrolledCourse;
import com.example.server.model.User;
import com.example.server.repositories.EnrolledCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrolledCourseServiceImpl implements EnrolledCourseService{

    @Autowired
    private EnrolledCourseRepository enrolledCourseRepository;

    @Override
    public List<EnrolledCourse> getEnrolledCourseByUserId(Long userId) {
        return enrolledCourseRepository.findByUserId(userId);
    }

    @Override
    public boolean isEnrolled(User user, Course course) {
        return enrolledCourseRepository.existsByUserAndCourse(user, course);
    }


    @Override
    public void save(EnrolledCourse enrolledCourse) {
        enrolledCourseRepository.save(enrolledCourse);
    }
}