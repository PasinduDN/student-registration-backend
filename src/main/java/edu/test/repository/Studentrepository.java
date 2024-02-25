package edu.test.repository;

import edu.test.dto.Student;
import edu.test.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface Studentrepository extends CrudRepository <StudentEntity,Long>{
}
