// Muhammed Safnas - 751008813

package com.rit.coursesphere.model;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long studentId;
    private Long courseId;
    private String enrolledAt;
    private String progress;
    private boolean completed;

    public Enrollment() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }

    public String getEnrolledAt() { return enrolledAt; }
    public void setEnrolledAt(String enrolledAt) { this.enrolledAt = enrolledAt; }

    public String getProgress() { return progress; }
    public void setProgress(String progress) { this.progress = progress; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}