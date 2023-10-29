package controller;
import model.Teacher;
import model.TeachingRole;

import java.util.ArrayList;

public class TeacherController {


    public static void getAllTeachers(ArrayList<TeachingRole> teachers){
        int cont = 0;
        for (TeachingRole professor: teachers) {
            cont++;
            System.out.println(cont +". " + professor.getName());
            System.out.println("ID: " + professor.getId());
            System.out.println("Salary: $" + professor.getSalary());
        }
        cont=0;
    }
}
