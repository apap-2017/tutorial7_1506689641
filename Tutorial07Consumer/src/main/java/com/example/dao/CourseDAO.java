package com.example.dao;

import java.util.List;

import com.example.model.CourseModel;

public interface CourseDAO {
	CourseModel selectCourseStudent(String id_course);
	List<CourseModel> selectAllCourse();
}
