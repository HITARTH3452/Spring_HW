package com.geekster.Student_Courses.services;

import com.geekster.Student_Courses.models.Student;
import com.geekster.Student_Courses.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;


    public List<Student> getStudentByCourseId(Long id) {
    }
}
