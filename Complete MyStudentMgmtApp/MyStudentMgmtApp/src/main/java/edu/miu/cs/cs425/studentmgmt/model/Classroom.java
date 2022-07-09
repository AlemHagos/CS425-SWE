package edu.miu.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


    @Entity
    @Table(name="classrooms")
    public class Classroom {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "classroom_id")
        private int classroomId;

        @Column(name = "building_name", nullable = false)
        private String buildingName;

        @Column(name = "room_number", nullable = false)
        private String roomNumber;

        @OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL)
        private List<Student> students;


        public Classroom() {
        }

        public Classroom(String buildingName, String roomNumber) {
            this.buildingName = buildingName;
            this.roomNumber = roomNumber;
        }

        public Classroom(int classroomId, String buildingName, String roomNumber) {
            this.classroomId = classroomId;
            this.buildingName = buildingName;
            this.roomNumber = roomNumber;
//            this.students = students;
//            setClassroomForStudents(students);
        }



        public int getClassroomId() {
            return classroomId;
        }

        public void setClassroomId(int classroomId) {
            this.classroomId = classroomId;
        }

        public String getBuildingName() {
            return buildingName;
        }

        public void setBuildingName(String buildingName) {
            this.buildingName = buildingName;
        }

        public String getRoomNumber() {
            return roomNumber;
        }

        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }

        public List<Student> getStudent() {
            return students;
        }


        public void setStudent(List<Student> students) {
            this.students = students;
        }

        @Override
        public String toString() {
            return "Classroom{" +
                    "classroomId=" + classroomId +
                    ", buildingName='" + buildingName + '\'' +
                    ", roomNumber='" + roomNumber + '\'' +
                    '}';
        }
    }
