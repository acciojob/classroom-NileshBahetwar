package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public void addTeacher(Teacher teacher){
        teacherRepository.addTeacher(teacher);
    }

    public Teacher getTeacherByName(String teacherName){
       return teacherRepository.getTeacherByName(teacherName);
    }

    public void deleteTeacherByName(String name){
        teacherRepository.deleteTeacherByName(name);
    }
    public void addStudentTeacherPair(String student,String teacher){
        teacherRepository.addStudentTeacherPair(student,teacher);
    }

    public List<String> getStudentsByTeacherName(String teacher){
        return teacherRepository.getStudentsByTeacherName(teacher);
    }

    public void deleteAllTeachers(){
        teacherRepository.deleteAllTeachers();
    }
}
