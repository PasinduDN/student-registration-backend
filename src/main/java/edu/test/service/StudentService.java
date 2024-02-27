package edu.test.service;

import edu.test.dto.Student;
import edu.test.entity.StudentEntity;

import java.util.List;

public interface StudentService {
//    ArrayList<Student> getStudent();

    StudentEntity createStudent (Student student);

    List<Student> retriveStudent();

    boolean removeStudent (Long studentID);
}
