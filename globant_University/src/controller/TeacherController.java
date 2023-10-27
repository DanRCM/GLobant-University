package controller;
import model.Teacher;

import java.util.ArrayList;

public class TeacherController {
    ArrayList<Teacher> teachers= new ArrayList<>();

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public ArrayList<Teacher> getAllTeachers(){
        return teachers;
    }
}
