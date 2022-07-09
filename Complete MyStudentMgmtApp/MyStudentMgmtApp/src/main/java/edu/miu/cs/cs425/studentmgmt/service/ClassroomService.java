package edu.miu.cs.cs425.studentmgmt.service;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import org.springframework.stereotype.Service;

@Service
public interface ClassroomService {
    public  abstract void addClassroom(Classroom classroom);
}
