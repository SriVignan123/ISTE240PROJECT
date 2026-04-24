// Yazan Ghawi - 744000192

package com.rit.coursesphere.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/instructors")
@CrossOrigin(origins = "*")
public class InstructorController {

    @GetMapping
    public String getInstructors() {
        return "Instructor endpoint - coming soon";
    }
}