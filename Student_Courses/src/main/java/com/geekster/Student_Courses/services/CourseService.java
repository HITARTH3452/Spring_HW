package com.geekster.Student_Courses.services;

import com.geekster.Student_Courses.models.Course;
import com.geekster.Student_Courses.repositories.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private ICourseRepo courseRepo;

    public void addCourse(Course myCourse){
        courseRepo.save(myCourse);
    }
}
