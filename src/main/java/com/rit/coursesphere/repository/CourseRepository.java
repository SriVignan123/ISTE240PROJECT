// Muhammed Safnas - 751008813

package com.rit.coursesphere.repository;

import com.rit.coursesphere.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByTitle(String title);

    @Query("SELECT c FROM Course c WHERE c.category = :category")
    List<Course> findByCategory(@Param("category") String category);

    @Modifying
    @Transactional
    @Query("UPDATE Course c SET c.title = :title WHERE c.id = :id")
    void updateTitleById(@Param("id") Long id, @Param("title") String title);
}