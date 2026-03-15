package com.rit.coursesphere.controller;

import com.rit.coursesphere.model.Instructor;
import com.rit.coursesphere.service.CourseSphereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InstructorController {

    @Autowired
    private CourseSphereService service;

    // --- INSTRUCTOR ROUTES ---

    @GetMapping("/instructors")
    public String listInstructors(Model model) {
        model.addAttribute("instructors", service.getAllInstructors());
        return "instructors";
    }

    @GetMapping("/instructors/add")
    public String addInstructorForm() {
        return "add-instructor";
    }

    @PostMapping("/instructors/add")
    public String saveInstructor(Instructor instructor) {
        service.addInstructor(instructor);
        return "redirect:/add/success/instructor";
    }
}