package controller;
import model.Teacher;

import java.util.ArrayList;

public class TeacherController {
    ArrayList<Teacher> teachers= new ArrayList<>();

    public void getAllTeachers(ArrayList<Teacher> teachers){
        int cont = 0;
        for (Teacher professor: teachers) {
            cont++;
            System.out.println(cont +". " + professor.getName());
            System.out.println("ID: " + professor.getId());
            System.out.println("Clase: " + professor.getClase().getName());
            System.out.println("Salary: $" + professor.getSalary());
        }
        cont=0;
    }
}
