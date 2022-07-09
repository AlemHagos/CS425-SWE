package edu.miu.cs.cs425.studentmgmt.service;

import edu.miu.cs.cs425.studentmgmt.model.Course;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    public abstract void addCourses(Course course);
}
