package com.rit.coursesphere.controller;

import com.rit.coursesphere.model.Course;
import com.rit.coursesphere.service.CourseSphereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {

    @Autowired
    private CourseSphereService service;



    @GetMapping("/courses")
    public String listCourses(Model model) {
        model.addAttribute("courses", service.getAllCourses());
        return "courses";
    }

    @GetMapping("/courses/add")
    public String addCourseForm() {
        return "add-course";
    }

    @PostMapping("/courses/add")
    public String saveCourse(Course course) {
        service.addCourse(course);
        return "redirect:/add/success/course";
    }
}