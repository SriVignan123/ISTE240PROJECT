// Muhammed Safnas - 751008813

package com.rit.coursesphere.controller;

import com.rit.coursesphere.model.Course;
import com.rit.coursesphere.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @GetMapping("/search")
    public List<Course> searchCourses(@RequestParam String category) {
        return courseService.searchByCategory(category);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        course.setId(id);
        return courseService.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "Course deleted successfully";
    }
}