package com.rit.coursesphere.model;

import org.springframework.stereotype.Component;

@Component
public class Enrollment {
    private int id;
    private String StudentID;
    private String CourseID;
    private String enrollmentDate;
    private String grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String courseID) {
        CourseID = courseID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
}
