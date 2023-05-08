package com.geekster.Student_Courses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private Integer courseDurationInMonths;

    @Enumerated(value = EnumType.STRING)
    private CourseType courseType;

    private double courseFee;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_student_id")
    private Student student;
}
