package controller;
import model.ClassRoom;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    static Scanner sc = new Scanner(System.in);

    public static Student createStudent(ArrayList<Student> students){
        int id = 0;
        String name;
        int age;
        boolean confirmation = true;

        sc = new Scanner(System.in);
        System.out.println("Give me information about the student");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Id: ");
        id = sc.nextInt();
        while(confirmation){
            for (Student student: students) {
                if(student.getId() == id){
                    System.out.println("This ID is already registered, choose anyone please");
                    id = sc.nextInt();
                }else{
                    confirmation = false;
                }
            }
        }
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
