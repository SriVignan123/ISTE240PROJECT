// Muhammed Safnas - 751008813

package com.rit.coursesphere.service;

import com.rit.coursesphere.model.Enrollment;
import com.rit.coursesphere.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Optional<Enrollment> getEnrollmentById(Long id) {
        return enrollmentRepository.findById(id);
    }

    public List<Enrollment> searchByStudentId(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }

    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public void updateProgress(Long id, String progress) {
        enrollmentRepository.updateProgressById(id, progress);
    }

    public void deleteEnrollment(Long id) {
        enrollmentRepository.deleteById(id);
    }
}