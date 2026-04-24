// Muhammed Safnas - 751008813

package com.rit.coursesphere.repository;

import com.rit.coursesphere.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {

    List<Enrollment> findByCourseId(Long courseId);

    @Query("SELECT e FROM Enrollment e WHERE e.studentId = :studentId")
    List<Enrollment> findByStudentId(@Param("studentId") Long studentId);

    @Modifying
    @Transactional
    @Query("UPDATE Enrollment e SET e.progress = :progress WHERE e.id = :id")
    void updateProgressById(@Param("id") Long id, @Param("progress") String progress);
}