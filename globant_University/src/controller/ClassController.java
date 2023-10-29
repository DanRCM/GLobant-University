package controller;

import model.ClassRoom;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;
public class ClassController {
    static Scanner sc = new Scanner(System.in);
    static int cont=0;
    public static void getAllClassRoom(ArrayList<ClassRoom> classRooms){
        for (ClassRoom classroom: classRooms) {
            cont++;
            System.out.println(cont + ". " + classroom.getClassroom());
        }
        cont = 0;
    }

    public static void chooseClass(ArrayList<ClassRoom> classes){
        int option,optionClass;
        System.out.println("Do you want to consult information about any class?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        option = sc.nextInt();

        if(option == 1) {
            System.out.println("Choose any class: ");
            optionClass = sc.nextInt();
            System.out.println(classes.get(optionClass - 1));
        }
        System.out.println("Thank you");
    }

    public static ClassRoom createClassRoom(ArrayList<Student> student, ArrayList<Teacher> teacher){
        String name, roomNumber;
        int optionTeacher;
        System.out.println("Give me information about the new class");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("RoomNumber: ");
        roomNumber = sc.next();
        System.out.println("Choose a teacher for this class");
        TeacherController.getAllTeachers(teacher);
        optionTeacher = sc.nextInt();
        return new ClassRoom(name, roomNumber, student, teacher.get(optionTeacher-1));
    }
}
