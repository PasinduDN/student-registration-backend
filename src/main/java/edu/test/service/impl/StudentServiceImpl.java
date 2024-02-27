package edu.test.service.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.test.dto.Student;
import edu.test.entity.StudentEntity;
import edu.test.repository.StudentNativeRepository;
import edu.test.repository.Studentrepository;
import edu.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    Studentrepository studentrepository;

    //For Model To Entity Auto Conversion
    @Autowired
    ObjectMapper mapper;

//    @Autowired
//    StudentNativeRepository studentNativeRepository;

    public StudentEntity createStudent (Student student){

        //Model To Entity Auto Conversion
        StudentEntity entity = mapper.convertValue(student, StudentEntity.class);

        //Model To Entity Manual Conversion
//        StudentEntity entity1 = new StudentEntity();
//        entity.setFirstName(student.getFirstName());
//        entity.setLastName(student.getLastName());
//        entity.setContactNumber(student.getContactNumber());

        //Saving Data
        studentrepository.save(entity);
        return entity;
    }

    @Override
    public List<Student> retriveStudent() {
        List<Student> list = new ArrayList<>();
        Iterable<StudentEntity> studentList = studentrepository.findAll();

        Iterator<StudentEntity> iterator = studentList.iterator();

        while (iterator.hasNext()){
            StudentEntity entity = iterator.next();
            Student student  = mapper.convertValue(entity, Student.class);
            list.add(student);
        }
        return list;
    }
    @Override
    public boolean removeStudent (Long studentID){

        Optional <StudentEntity> studentEntityOptional =
                studentrepository.findById(studentID);

        if (studentEntityOptional.isPresent()){
            studentrepository.deleteById(studentID);
            return true;
        }
        return false;
    }
}
