package com.geekster.Student_Courses.repositories;

import com.geekster.Student_Courses.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepo extends JpaRepository<Student,Long> {

    @Query(value = "select * from student_table"nativeQuery = true)
    List<Student> getStudentByCourseID(Long id);
}
