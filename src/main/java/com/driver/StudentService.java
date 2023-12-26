package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }

    public Student getStudentByName(String studentName){
       return studentRepository.getStudentByName(studentName);
    }

     public List<String>getAllStudents(){
        return studentRepository.getAllStudents();
     }
}
