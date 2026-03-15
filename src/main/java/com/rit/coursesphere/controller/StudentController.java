package com.rit.coursesphere.controller;

import com.rit.coursesphere.model.Enrollment;
import com.rit.coursesphere.model.Student;
import com.rit.coursesphere.service.CourseSphereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private CourseSphereService service;

    // --- STUDENT ROUTES ---

    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students"; // will look for students.mustache
    }

    @GetMapping("/students/add")
    public String addStudentForm() {
        return "add-student";
    }

    @PostMapping("/students/add")
    public String saveStudent(Student student) {
        service.addStudent(student);
        return "redirect:/add/success/student";
    }

    // --- ENROLLMENT ROUTES ---

    @GetMapping("/enrollments")
    public String listEnrollments(Model model) {
        model.addAttribute("enrollments", service.getAllEnrollments());
        return "enrollments";
    }

    @GetMapping("/enrollments/add")
    public String addEnrollmentForm() {
        return "add-enrollment";
    }

    @PostMapping("/enrollments/add")
    public String saveEnrollment(Enrollment enrollment) {
        service.addEnrollment(enrollment);
        return "redirect:/add/success/enrollment";
    }

    // --- SUCCESS ROUTE ---

    @GetMapping("/add/success/{type}")
    public String successPage(@PathVariable String type, Model model) {
        model.addAttribute("type", type);
        return "success";
    }
}