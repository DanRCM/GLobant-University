package controller;

import model.ClassRoom;
import model.Student;
import model.Teacher;
import model.TeachingRole;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassController {
    Scanner sc = new Scanner(System.in);
    TeacherController teacherController = new TeacherController();
    int cont=0;
    public void getAllClassRoom(ArrayList<ClassRoom> classRooms){
        for (ClassRoom classroom: classRooms) {
            cont++;
            System.out.println(cont + ". " + classroom.getClassroom());
        }
        cont = 0;
    }
    public void displayClassData(ArrayList<ClassRoom> classes){
        int cont = 0;
        for (ClassRoom classRoom: classes) {
            cont +=1;
            System.out.println(cont + ". " + classRoom.getClassroom());
        }
        cont = 0;
    }

    public void chooseClass(ArrayList<ClassRoom> classes){
        int option,optionClass;
        System.out.println("Do you want to consult information about any class?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        option = sc.nextInt();

        if(option == 1) {
            System.out.println("Choose any class: ");
            displayClassData(classes);
            optionClass = sc.nextInt();
            System.out.println(classes.get(optionClass - 1));
        }
        System.out.println("Thank you");
    }

    public ClassRoom createClassRoom(ArrayList<Student> student, ArrayList<TeachingRole> teacher){
        String name, roomNumber;
        int optionTeacher;
        System.out.println("Give me information about the new class");
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("RoomNumber: ");
        roomNumber = sc.next();
        System.out.println("Choose a teacher for this class");
        teacherController.getAllTeachers(teacher);
        optionTeacher = sc.nextInt();
        return new ClassRoom(name, roomNumber, student, (Teacher) teacher.get(optionTeacher-1));
    }
}
