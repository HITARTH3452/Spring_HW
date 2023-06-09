package com.geekster.Student_Courses.controllers;

import com.geekster.Student_Courses.models.Course;
import com.geekster.Student_Courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "course/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/")
    public void createCourse(@RequestBody Course myCourse){
        courseService.addCourse(myCourse);
    }
}
