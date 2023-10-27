/*
Java Basics Module Final Exercise I want to make a system to track my university
classes, teachers and students. Each Teacher has a name, and a salary
calculated by the following rules:
● For the full time teachers: base salary (attribute) multiplied by 110%
of its experience years.
● For part time teachers: base salary multiplied for its active hours
per week.
The university includes a list of teachers, a list of students
and a list of classes. Each class has a name, an assigned classroom, a
list of students and a teacher. Every student has his name, id, and age.

The program should:
1. Initialize minimum 2 different teachers of each type
(full time, part time).
2. Initialize minimum 6 different students
3. Initialize minimum 4 different classes including its teacher ,
students and other relevant data
4. Print a menú including the following
options: 
a. Print all the professors with its data
b. Print all the classes and a submenu to select a class in order to
print the class data including its teacher and students
c. Create a new student and add it to an existing class
d. Create a new class and add an existing teacher, existing students and its
relevant data
e. List all the classes in which a given student is
included (hint: search by id)
f. Exit*/
import model.*;
import controller.*;

import java.lang.Class;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FullTimeTeacher fullTimeTeacher = new FullTimeTeacher(1, "Julio Jordan", 200.0,null, 5);
        PartTimeTeacher partTimeTeacher = new PartTimeTeacher(2,"Braulio Rivas",100.0,null, 40);

        TeacherController teacherController = new TeacherController();
        teacherController.addTeacher(fullTimeTeacher);
        teacherController.addTeacher(partTimeTeacher);

        ClassController classController = new ClassController();

        Student student1 = new Student(1,"Rodrigo Borja", 12);
        Student student2 = new Student(2,"Carlos Cortez", 11);
        Student student3 = new Student(3,"Erick Campusano", 13);
        Student student4 = new Student(4,"Sofia Izaguirre", 14);
        Student student5 = new Student(5,"Javier Toledo", 12);
        Student student6 = new Student(6,"Juan Roman", 13);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

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
        fullTimeTeacher.setClase(clase2);

        classController.chooseClass(classes);
    }
}