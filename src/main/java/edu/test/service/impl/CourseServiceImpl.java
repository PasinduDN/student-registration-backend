package edu.test.service.impl;

import edu.test.dto.Course;
import edu.test.service.CourseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CourseServiceImpl implements CourseService {

    @Value("${application.institute}")
    String institute;

    public ArrayList<Course> getCourses(){
        ArrayList<Course> courseList = new ArrayList<>();

        courseList.add(new Course(institute,"ICT-A","40000","4"));
        courseList.add(new Course(institute,"ICT-B","60000","6"));
        courseList.add(new Course(institute,"ICT-C","80000","8"));
        courseList.add(new Course(institute,"ICT-D","100000","10"));
        courseList.add(new Course(institute,"ICT-E","120000","12"));

        return courseList;
    }
}
