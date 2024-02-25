package edu.test.service.impl;
import edu.test.dto.Student;
import edu.test.service.StudentService;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public ArrayList<Student> getStudent() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Amila","Nuwan","011111111"));
        studentList.add(new Student("Azt","Lopz","01266555"));
        studentList.add(new Student("App","Nurz","022154477"));
        studentList.add(new Student("AmilSpt","Klo","01487555"));

        return studentList;
    }
}
