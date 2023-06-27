package com.treeschool.spring.gestinesegreteria.config;

import com.treeschool.spring.gestinesegreteria.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class StudentManager {
    private List<Student> students;

    public StudentManager(){
        students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getRegisteredStudents(){
        return students;
    }
}
