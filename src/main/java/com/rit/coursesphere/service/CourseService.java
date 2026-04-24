// Muhammed Safnas - 751008813

package com.rit.coursesphere.service;

import com.rit.coursesphere.model.Course;
import com.rit.coursesphere.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public List<Course> searchByCategory(String category) {
        return courseRepository.findByCategory(category);
    }

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public void updateCourseTitle(Long id, String title) {
        courseRepository.updateTitleById(id, title);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}