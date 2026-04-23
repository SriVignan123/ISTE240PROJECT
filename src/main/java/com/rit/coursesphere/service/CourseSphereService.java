package com.rit.coursesphere.service;

import com.rit.coursesphere.model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseSphereService {
    // These lists simulate your database tables
    private List<Student> students = new ArrayList<>();
    private List<Enrollment> enrollments = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();

    // Seed each list with a few records so tables aren't empty on startup
    @PostConstruct
    public void seedData() {
        // ---- STUDENTS ----
        Student s1 = new Student();
        s1.setId(1L);
        s1.setName("Omar Haddad");
        s1.setEmail("oha1450@g.rit.edu");
        students.add(s1);

        Student s2 = new Student();
        s2.setId(2L);
        s2.setName("Lina Khoury");
        s2.setEmail("lkh2210@g.rit.edu");
        students.add(s2);

        Student s3 = new Student();
        s3.setId(3L);
        s3.setName("Rami Nasr");
        s3.setEmail("rna3318@g.rit.edu");
        students.add(s3);

        // ---- COURSES ----
        Course c1 = new Course();
        c1.setId(240L);
        c1.setTitle("ISTE 240");
        c1.setDescription("Web & Mobile II");
        courses.add(c1);

        Course c2 = new Course();
        c2.setId(230L);
        c2.setTitle("ISTE 230");
        c2.setDescription("Introduction to Database & Data Modeling");
        courses.add(c2);

        Course c3 = new Course();
        c3.setId(241L);
        c3.setTitle("NSSA 241");
        c3.setDescription("System Administration I");
        courses.add(c3);

        // ---- INSTRUCTORS ----
        Instructor i1 = new Instructor();
        i1.setId(1L);
        i1.setName("Samer Najjar");
        i1.setEmail("snajjar@rit.edu");
        instructors.add(i1);

        Instructor i2 = new Instructor();
        i2.setId(2L);
        i2.setName("Rania Shami");
        i2.setEmail("rshami@rit.edu");
        instructors.add(i2);

        // ---- ENROLLMENTS (link Students with Courses) ----
        Enrollment e1 = new Enrollment();
        e1.setId(1);
        e1.setStudentID("1");
        e1.setCourseID("240");
        e1.setEnrollmentDate("2026-01-15");
        e1.setGrade("A");
        enrollments.add(e1);

        Enrollment e2 = new Enrollment();
        e2.setId(2);
        e2.setStudentID("2");
        e2.setCourseID("240");
        e2.setEnrollmentDate("2026-01-15");
        e2.setGrade("B+");
        enrollments.add(e2);

        Enrollment e3 = new Enrollment();
        e3.setId(3);
        e3.setStudentID("1");
        e3.setCourseID("230");
        e3.setEnrollmentDate("2026-01-15");
        e3.setGrade("A-");
        enrollments.add(e3);
    }

    // Student Methods
    public List<Student> getAllStudents() { return students; }
    public void addStudent(Student student) { students.add(student); }

    // Enrollment Methods
    public List<Enrollment> getAllEnrollments() { return enrollments; }
    public void addEnrollment(Enrollment enrollment) { enrollments.add(enrollment); }

    // Course Methods
    public List<Course> getAllCourses() { return courses; }
    public void addCourse(Course course) { courses.add(course); }

    // Instructor Methods
    public List<Instructor> getAllInstructors() { return instructors; }
    public void addInstructor(Instructor instructor) { instructors.add(instructor); }
}