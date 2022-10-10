package br.com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface CourseRepositoryJpa extends JpaRepository <CourseEntity, Long> {

    @Query("select s from CourseEntity s where not exists elements(s.studentList)")
    Set<CourseEntity> findCoursesWithoutStudents();

}

