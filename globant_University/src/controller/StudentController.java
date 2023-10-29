package controller;
import model.ClassRoom;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public static Student createStudent(){
        int id;
        String name;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me information about the student");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Id: ");
        id = sc.nextInt();
        System.out.println("Age: ");
        age = sc.nextInt();

        return new Student(id, name, age);
    }

    public static void searchStudent(ArrayList<ClassRoom> classrooms, int studentIdToSearch){
        for (ClassRoom classroom : classrooms) {
            ArrayList<Student> studentsInClass = classroom.getStudents();
            for (Student student : studentsInClass) {
                if (student.getId() == studentIdToSearch) {
                    System.out.println("Student with ID " + studentIdToSearch + " is in " + classroom.getName()+" class");
                }
            }
        }
    }

}
