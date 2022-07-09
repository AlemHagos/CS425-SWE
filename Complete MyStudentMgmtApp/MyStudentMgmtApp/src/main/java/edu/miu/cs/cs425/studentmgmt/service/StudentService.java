package edu.miu.cs.cs425.studentmgmt.service;

import edu.miu.cs.cs425.studentmgmt.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public abstract Student saveStudent(Student student);
}
