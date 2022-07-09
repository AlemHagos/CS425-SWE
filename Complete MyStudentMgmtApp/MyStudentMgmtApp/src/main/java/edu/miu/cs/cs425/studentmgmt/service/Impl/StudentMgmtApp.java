package edu.miu.cs.cs425.studentmgmt.service.Impl;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.service.ClassroomService;
import edu.miu.cs.cs425.studentmgmt.service.CourseService;
import edu.miu.cs.cs425.studentmgmt.service.StudentService;
import edu.miu.cs.cs425.studentmgmt.service.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentMgmtApp {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassroomService classroomService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private TranscriptService transcriptService;
    public void saveStudent(Student student){
        studentService.saveStudent(student);
    }
    public void saveClassroom(Classroom classroom){
        classroomService.addClassroom(classroom);
    }
    public void saveCourse(Course course){
        courseService.addCourses(course);
    }
    public void saveTranscript(Transcript transcript){
        transcriptService.addTranscript(transcript);
    }

}
