package edu.test.service.impl;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.test.dto.Student;
import edu.test.entity.StudentEntity;
import edu.test.repository.Studentrepository;
import edu.test.service.StudentService;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    Studentrepository studentrepository;

    //For Model To Entity Auto Conversion
    @Autowired
    ObjectMapper mapper;

    public void createStudent (Student student){

        //Model To Entity Auto Conversion
        StudentEntity entity = mapper.convertValue(student, StudentEntity.class);

        //Model To Entity Manual Conversion
//        StudentEntity entity1 = new StudentEntity();
//        entity.setFirstName(student.getFirstName());
//        entity.setLastName(student.getLastName());
//        entity.setContactNumber(student.getContactNumber());

        //Saving Data
        studentrepository.save(entity);
    }
}
