package edu.test.controller;
import edu.test.dto.Course;
import edu.test.service.CourseService;
import edu.test.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courseList")
    public ArrayList<Course> getCourses(){
//        CourseServiceImpl courseService = new CourseServiceImpl();
        ArrayList<Course> courses = courseService.getCourses();
        return courses;
    }
}
