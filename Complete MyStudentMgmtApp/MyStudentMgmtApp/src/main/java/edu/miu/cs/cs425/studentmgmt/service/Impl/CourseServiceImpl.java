package edu.miu.cs.cs425.studentmgmt.service.Impl;

import edu.miu.cs.cs425.studentmgmt.Repository.CourseRepository;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;


    @Override
    public void addCourses(Course course) {
        courseRepository.save(course);

    }
}
