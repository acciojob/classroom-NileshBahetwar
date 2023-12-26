package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class TeacherRepository {
    HashMap<String,Teacher> teacherDB;
    HashMap<String, ArrayList<String>> teacherVsStudentsDB;

    TeacherRepository(){
        teacherDB=new HashMap<>();
        teacherVsStudentsDB=new HashMap<>();
    }

    public void addTeacher(Teacher teacher){
        String teacherName= teacher.getName();
        teacherDB.put(teacherName,teacher);
        teacherVsStudentsDB.put(teacher.getName(),new ArrayList<>());
    }

    public void addStudentTeacherPair(String student,String teacher){
        ArrayList<String> students = teacherVsStudentsDB.get(teacher);
        students.add(student);
        teacherVsStudentsDB.put(teacher,students);
    }
    public Teacher getTeacherByName(String teacherName){
        return teacherDB.get(teacherName);
    }

    public void deleteTeacherByName(String name)
    {
        teacherDB.remove(name);
        teacherVsStudentsDB.remove(name);
    }

    public List<String> getStudentsByTeacherName(String teacher){
        return teacherVsStudentsDB.get(teacher);
    }

    public void deleteAllTeachers(){

//        for(String teacher : teacherDB.keySet()){
//            if(teacherDB.size()>0){
//                teacherDB.remove(teacher);
//            }
//        }
//
//        for(String teacher : teacherVsStudentsDB.keySet()){
//            if(teacherVsStudentsDB.size()>0){
//                teacherVsStudentsDB.remove(teacher);
//            }
//        }

        teacherDB=new HashMap<>();
        teacherVsStudentsDB=new HashMap<>();
    }
}
