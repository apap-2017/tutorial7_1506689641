package com.example.service;

import java.util.List;

import com.example.model.CourseModel;

public interface CourseService {
	   
    CourseModel selectCourseStudent (String id_course);
    List<CourseModel> selectAllCourse ();
}
