package edu.miu.cs.cs425.studentmgmt.service.Impl;

import edu.miu.cs.cs425.studentmgmt.Repository.ClassroomRepository;
import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
   private ClassroomRepository classroomRepository;

    @Override
    public void addClassroom(Classroom classroom) {
            classroomRepository.save(classroom);
    }
}
