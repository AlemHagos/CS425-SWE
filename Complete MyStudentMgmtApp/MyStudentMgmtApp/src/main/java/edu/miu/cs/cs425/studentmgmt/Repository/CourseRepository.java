package edu.miu.cs.cs425.studentmgmt.Repository;

import edu.miu.cs.cs425.studentmgmt.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course,Integer> {
}
