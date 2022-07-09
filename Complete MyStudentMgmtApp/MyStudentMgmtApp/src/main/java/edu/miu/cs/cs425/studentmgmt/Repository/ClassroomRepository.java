package edu.miu.cs.cs425.studentmgmt.Repository;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClassroomRepository extends JpaRepository<Classroom,Integer> {
}
