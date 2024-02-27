package edu.test.repository.impl;

import edu.test.repository.StudentNativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashMap;

@Repository
public class StudentNativeRepositoryImpl implements StudentNativeRepository {

//    @Autowired
    protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public Boolean removeStudent(long studentId){
        int updateStatus = namedParameterJdbcTemplate.update(
                "DELETE FROM STUDENT WHERE ID=:id",
                Collections.singletonMap("id",studentId));

        if (updateStatus > 0){
            return true;
        }
        return false;
    }


}
