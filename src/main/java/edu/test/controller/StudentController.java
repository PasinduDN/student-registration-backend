package edu.test.controller;

import edu.test.dto.Student;
import edu.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/studentList")
    public ArrayList<Student> getStudent(){
        ArrayList<Student> student = studentService.getStudent();
        return student;
    }
}
