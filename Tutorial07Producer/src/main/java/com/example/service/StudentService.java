package com.example.service;

import java.util.List;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);
    
    CourseModel selectCoursesStudent (String id);

    List<StudentModel> selectAllStudents ();
    
    List<CourseModel> selectAllCourse();


    void addStudent (StudentModel student);


    void deleteStudent (String npm);
    
    void updateStudent (StudentModel student);
}