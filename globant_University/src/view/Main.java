package view;

import model.*;
import controller.*;

import java.lang.Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<TeachingRole> teachers = new ArrayList<>();
        FullTimeTeacher fullTimeTeacher = new FullTimeTeacher(1, "Julio Jordan", 200.0,null, 5);
        PartTimeTeacher partTimeTeacher = new PartTimeTeacher(2,"Braulio Rivas",100.0,null, 40);
        teachers.add(fullTimeTeacher);
        teachers.add(partTimeTeacher);

        ClassController classController = new ClassController();
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Rodrigo Borja", 12));
        students.add(new Student(2,"Carlos Cortez", 11));
        students.add(new Student(3,"Erick Campusano", 13));
        students.add(new Student(4,"Sofia Izaguirre", 14));
        students.add(new Student(5,"Javier Toledo", 12));
        students.add(new Student(6,"Juan Roman", 13));

        ClassRoom clase1 = new ClassRoom("Biology","A001", students, fullTimeTeacher);
        ClassRoom clase2 = new ClassRoom("Chemical","A002", students, partTimeTeacher);
        ClassRoom clase3 = new ClassRoom("Math","A003", students, fullTimeTeacher);
        ClassRoom clase4 = new ClassRoom("Science","A004", students, partTimeTeacher);
        ArrayList<ClassRoom> classes = new ArrayList<>();
        classes.add(clase1);
        classes.add(clase2);
        classes.add(clase3);
        classes.add(clase4);
        fullTimeTeacher.setClase(clase1);
        partTimeTeacher.setClase(clase2);
        fullTimeTeacher.setClase(clase3);
        partTimeTeacher.setClase(clase4);

        do {
            System.out.println("Menu:");
            System.out.println("1. Print all the professors with their data");
            System.out.println("2. Print all the classes");
            System.out.println("3. Create a new student and add it to an existing class");
            System.out.println("4. Create a new class and add an existing teacher, existing students, and relevant data");
            System.out.println("5. List all the classes in which a given student is included");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    teacherController.getAllTeachers(teachers);
                    break;
                case 2:
                    classController.getAllClassRoom(classes);
                    classController.chooseClass(classes);
                    break;
                case 3:
                    Student student = studentController.createStudent();
                    students.add(student);
                    break;
                case 4:
                    classes.add(classController.createClassRoom(students,teachers));
                    break;
                case 5:
                    int id;
                    System.out.println("Enter the student ID to find out the classes in which they are registered");
                    id = scanner.nextInt();
                    studentController.searchStudent(classes, id);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}