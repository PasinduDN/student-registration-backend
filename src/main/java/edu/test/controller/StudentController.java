package edu.test.controller;
import edu.test.dto.Response;
import edu.test.dto.Student;
import edu.test.entity.StudentEntity;
import edu.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController()
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    StudentEntity createStudent (@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PatchMapping("/student")
    StudentEntity updateStudent (@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/student")
    List<Student> getstudent(){
        return studentService.retriveStudent();
    }

    @DeleteMapping("/student/{studentId}")
    Response removeStudent(@PathVariable Long studentId){
        boolean isRemoved = studentService.removeStudent(studentId);

        if(isRemoved){
            return new Response(String.format("Removed Student Id(%s)", studentId));
        } else {
            return new Response(String.format("Student Id(%s) Invalid", studentId));
        }


    }
}
