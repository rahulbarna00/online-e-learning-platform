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

Happy learning! 🚀


