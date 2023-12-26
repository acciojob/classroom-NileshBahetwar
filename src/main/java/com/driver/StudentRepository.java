package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

    HashMap<String,Student> studentDB;
    ArrayList<String>allStudents;
    StudentRepository(){
        studentDB=new HashMap<>();
        allStudents=new ArrayList<>();
    }

    public void addStudent(Student student){
        String name = student.getName();
        studentDB.put(name,student);
        this.allStudents.add(name);
    }

    public Student getStudentByName(String studentName){
        return studentDB.get(studentName);
    }

    public List<String>getAllStudents(){
        return this.allStudents;
    }
}
