package com.rit.coursesphere.service;

import com.rit.coursesphere.model.*;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseSphereService {
    // These lists simulate your database tables
    private List<Student> students = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();

    // Instructor Seed Data
    public CourseSphereService() {
        instructors.add(new Instructor(1L, "Rashid Ali", "rashidali@coursesphere.edu"));
        instructors.add(new Instructor(2L, "Ahmed Nasser", "ahmednasser@coursesphere.edu"));
        instructors.add(new Instructor(3L, "Mohammed Mustafa", "mohammedmustafa@coursesphere.edu"));
    }

    // Student Methods
    public List<Student> getAllStudents() { return students; }
    public void addStudent(Student student) { students.add(student); }

    // Enrollment Methods
    public List<Enrollment> getAllEnrollments() { return enrollments; }
    public void addEnrollment(Enrollment enrollment) { enrollments.add(enrollment); }

    // Placeholder methods for Member 2 and 3 to use later
    public List<Course> getAllCourses() { return courses; }
    public void addCourse(Course course) { courses.add(course); }
    public List<Instructor> getAllInstructors() { return instructors; }
    public void addInstructor(Instructor instructor) { instructors.add(instructor); }
}