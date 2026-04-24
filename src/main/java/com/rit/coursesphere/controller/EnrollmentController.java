// Muhammed Safnas - 751008813

package com.rit.coursesphere.controller;

import com.rit.coursesphere.model.Enrollment;
import com.rit.coursesphere.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/enrollments")
@CrossOrigin(origins = "*")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Optional<Enrollment> getEnrollmentById(@PathVariable Long id) {
        return enrollmentService.getEnrollmentById(id);
    }

    @GetMapping("/search")
    public List<Enrollment> searchEnrollments(@RequestParam Long studentId) {
        return enrollmentService.searchByStudentId(studentId);
    }

    @PostMapping
    public Enrollment createEnrollment(@RequestBody Enrollment enrollment) {
        return enrollmentService.saveEnrollment(enrollment);
    }

    @PutMapping("/{id}")
    public Enrollment updateEnrollment(@PathVariable Long id, @RequestBody Enrollment enrollment) {
        enrollment.setId(id);
        return enrollmentService.saveEnrollment(enrollment);
    }

    @DeleteMapping("/{id}")
    public String deleteEnrollment(@PathVariable Long id) {
        enrollmentService.deleteEnrollment(id);
        return "Enrollment deleted successfully";
    }
}