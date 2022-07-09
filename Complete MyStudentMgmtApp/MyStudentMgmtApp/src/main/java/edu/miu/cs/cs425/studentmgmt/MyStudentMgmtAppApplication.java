package edu.miu.cs.cs425.studentmgmt;

import edu.miu.cs.cs425.studentmgmt.model.Classroom;
import edu.miu.cs.cs425.studentmgmt.model.Course;
import edu.miu.cs.cs425.studentmgmt.model.Student;
import edu.miu.cs.cs425.studentmgmt.model.Transcript;
import edu.miu.cs.cs425.studentmgmt.service.Impl.StudentMgmtApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
    @Autowired
    public StudentMgmtApp studentMgmtApp;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome");
         Transcript t1=new Transcript(1, "BS Computer Science");
         Transcript t2=new Transcript(2, "MS Computer Science");

        Classroom c1= new Classroom(1,"McLaughlin building", "M105");
        Classroom c2= new Classroom(2,"Verill", "M105");

        Course co1 = new Course("FPP", "CS390", 4.0f);
        Course co2 = new Course("MPP", "CS390", 4.0f);

        Student s1= new Student( 1,"000-61-0001","Anna","Lynn", "Smith", 3.45, LocalDate.of(2019,5,24));
        Student s2= new Student( 2,"000-61-0001","Bob","Lynn", "Smith", 3.45, LocalDate.of(2019,5,24));
        Transcript [] transcripts={t1,t2};
        Classroom [] classrooms ={c1,c2};
        Course [] courses = {co1,co2};

        for (Transcript t:transcripts){
            studentMgmtApp.saveTranscript(t);
        }
        for (Classroom c:classrooms){
            studentMgmtApp.saveClassroom(c);
        }
        for (Course co:courses){
            studentMgmtApp.saveCourse(co);
        }
        s1.setTranscript(t1);
        s2.setTranscript(t2);

        s1.setClassroom(c1);
        s2.setClassroom(c2);

        s1.setCourses(List.of(courses));
        s2.setCourses(List.of(courses));

        Student[] students={s1,s2};
        for (Student s:students){
            studentMgmtApp.saveStudent(s);
        }



    }

}
