package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.CourseModel;
import com.example.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	CourseService courseDAO;
	
	  @RequestMapping("/course/view/{id_course}")	
	    public String viewCourse (Model model,
	    		@PathVariable(value = "id_course") String id_course)
	    {
	    	System.out.println("sampai sini masuk ga");
	    	System.out.println("ternyata sampai sini masuk");
	    	CourseModel course = courseDAO.selectCourseStudent(id_course);
	    	
	    	if (course != null) {
	    		model.addAttribute("student", course);
	    		return "viewcourse";
	    	} else {
	    		model.addAttribute("id", id_course);
	    		return "not-found";
	    	}
	    }
	  
	  @RequestMapping("course/viewall")
	  public String viewAll(Model model) {
		  List<CourseModel> course = courseDAO.selectAllCourse();
		  model.addAttribute("course", course);
		  return "viewAllCourse";
	  }
}
