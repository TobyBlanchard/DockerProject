package com.bootcamp.demo.Service;


import com.bootcamp.demo.Model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    private List<Student> studentList = new ArrayList<Student>();

    public StudentService(){
        //using default contstructor from Student class to create a Student
        Student student1 = new Student();
        student1.setName("Shahar");
        student1.setAge(24);
        //using constructor that takes parameters from Student class to create a Student
        Student student2 = new Student("Victor", 25);
        Student student3 = new Student("Noelle", 24);
        Student student4 = new Student("Mariano", 25);
        //Adding each student to the list declared in this class
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }
    //method that returns the list of students created
    public List<Student> getStudentList() {
        return studentList;
    }
}
