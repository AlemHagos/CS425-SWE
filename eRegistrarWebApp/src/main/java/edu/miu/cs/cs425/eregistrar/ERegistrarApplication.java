package edu.miu.cs.cs425.eregistrar;

import edu.miu.cs.cs425.eregistrar.Service.StudentService;
import edu.miu.cs.cs425.eregistrar.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ERegistrarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ERegistrarApplication.class, args);
    }
    @Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        Student s1=new Student(1,"000-61-0001"," Alex","Salmon","Charles",4.0, LocalDate.of(2019,5,12),"Yes");
        Student s2=new Student(2,"000-61-0002"," James","Charles","Jackson",3.86, LocalDate.of(2021,8,19),"Yes");
        Student s3=new Student(3,"000-61-0003"," Anna","Don","Smith",3.95, LocalDate.of(2020,9,21),"Yes");
        Student s4=new Student(4,"000-61-0004"," Marta","Sanders","Anthony",3.78, LocalDate.of(2022,6,27),"Yes");
        Student[] students={s1,s2,s3,s4};
        for (Student s:students){
            studentService.addStudent(s);
        }
    }
}
