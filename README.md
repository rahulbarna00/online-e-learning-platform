# E-Learning Platform - Java Spring Boot Project

## Overview

Welcome to the E-Learning Platform, a Java Spring Boot project designed to provide a robust and secure online learning experience. This project utilizes the Spring Security framework for authentication, ensuring that only authorized users can access the platform. SQL is used as the database for storing user information.

## Features

- **User Authentication**: Secure authentication using Spring Security to protect the platform from unauthorized access.

- **User Registration**: New users can register on the platform, providing necessary details to create an account.

- **Role-based Access Control**: Different roles (e.g., student, instructor, admin) with varying levels of access to the platform.

- **Password Encryption**: Passwords are stored securely using encryption techniques provided by Spring Security.

- **User Profile**: Users can view and update their profiles, managing personal information.

- **Course Management**: Instructors can create and manage courses.

- **Course Search and Enrollment**: Users can search for available courses, view details, and enroll in the courses they are interested in.

- **Session Management**: Efficient session handling to track user sessions and manage their lifecycle.

## Spring Security Configuration

The Spring Security configuration for this project is defined in the `SecurityConfig` class. It includes:

- **AuthenticationProvider**: Custom authentication provider for validating user credentials.

- **UserDetailsService**: Implementation of the `UserDetailsService` interface to load user details from the SQL database.

- **PasswordEncoder**: Configuration for password encoding using BCrypt.

- **HttpSecurity Configuration**: Rules for securing different endpoints based on user roles.

## Usage

- Register a new user on the platform.
- Log in with your credentials.
- Explore available courses and enroll in the ones you are interested in.
- Instructors can create and manage courses.

You can find some screenshots below
Happy learning! 🚀

![1](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/20e05a4f-76df-4f01-84cd-8602dbc0a20c)
![2](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/8a28ce16-3233-4723-a1f3-2106976e3367)
![3](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/2509b5a9-54f1-4068-8832-f05066382277)
![4](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/393d42f1-f507-42fc-8dfb-02c47614b71c)
![5](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/6a43bcd7-aed2-443f-89e5-9d3f454f700d)
![6](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/3a0fe90c-50dc-4591-8d0f-d32d2ce25c08)
![7](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/12e6b8f5-5611-45a8-a77d-957391cf5cec)
![8](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/fe069cb5-3d5f-473f-88b2-39d05e80e8ae)
![9](https://github.com/rahulbarna00/online-e-learning-platform/assets/97344601/39d7cf39-1a75-4651-94d8-4b4eb80916dd)
