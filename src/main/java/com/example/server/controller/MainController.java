package com.example.server.controller;

import java.security.Principal;
import java.util.List;

import com.example.server.service.course.CourseService;
import com.example.server.service.course.EnrolledCourseServiceImpl;
import com.example.server.service.user.CustomUserDetails;
import com.example.server.service.user.CustomUserDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.server.dto.UserDto;
import com.example.server.service.user.UserService;
import com.example.server.model.*;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    @Qualifier("customUserDetailsServices")
    private CustomUserDetailsServices customUserDetailsServices;

    @Autowired
    private EnrolledCourseServiceImpl enrolledCourseService;

    private UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/course")
    public String enrollCourse(Model model, Principal principal) {

        CustomUserDetails userDetails = (CustomUserDetails) customUserDetailsServices.loadUserByUsername(principal.getName());

        List<Course> courses = courseService.getAllCourse();

        model.addAttribute("courses", courses);
        model.addAttribute("userdetail", userDetails);

        return "course";
    }

    @PostMapping("/course")
    public String enrolledCoursePost(@RequestParam Long courseId, @RequestParam Long userId) {
		User user = customUserDetailsServices.findUserById(userId);
		Course course = courseService.getCourseById(courseId);

        if (!enrolledCourseService.isEnrolled(user, course)) {
            EnrolledCourse enrolledCourse = new EnrolledCourse();
            enrolledCourse.setUser(user);
            enrolledCourse.setCourse(course);

            enrolledCourseService.save(enrolledCourse);

            return "redirect:/dashboard";
        } else {
            return "redirect:/course?enrolled";
        }

    }


    @GetMapping("/dashboard")
    public String dashboard(Model model, Principal principal) {
        if (principal == null) {
            return "redirect:/login";
        }

        CustomUserDetails userDetails = (CustomUserDetails) customUserDetailsServices.loadUserByUsername(principal.getName());

        List<EnrolledCourse> enrolledCourseList = enrolledCourseService.getEnrolledCourseByUserId(userDetails.getId());

        model.addAttribute("enrolledCourses", enrolledCourseList);

        model.addAttribute("userdetail", userDetails);
        return "dashboard";
    }

    @GetMapping("/login")
    public String login(Model model, UserDto userDto) {
        model.addAttribute("user", userDto);
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model, UserDto userDto) {
        model.addAttribute("user", userDto);
        return "register";
    }

    @PostMapping("/register")
    public String registerSave(@ModelAttribute("user") UserDto userDto, Model model) {
        User user = userService.findByUsername(userDto.getUsername());
        if (user != null) {
            model.addAttribute("userexist", user);
            return "register";
        }
        userService.save(userDto);
        return "redirect:/register?success";
    }
}