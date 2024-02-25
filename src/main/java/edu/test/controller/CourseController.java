package edu.test.controller;

import edu.test.dto.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CourseController {

    @GetMapping("/courseList")
    public ArrayList<Course> getCourses(){
        ArrayList<Course> courseList = new ArrayList<>();

        courseList.add(new Course("IMPT","ICT-A","40000","4"));
        courseList.add(new Course("IMPT","ICT-B","60000","6"));
        courseList.add(new Course("IMPT","ICT-C","80000","8"));
        courseList.add(new Course("IMPT","ICT-D","100000","10"));
        courseList.add(new Course("IMPT","ICT-E","120000","12"));

        return courseList;
    }
}
