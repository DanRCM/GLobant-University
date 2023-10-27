package controller;

import model.ClassRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassController {
    ArrayList<ClassRoom> classes = new ArrayList<>();
    public void displayClassData(ArrayList<ClassRoom> classes){
        int cont = 0;
        for (ClassRoom classRoom: classes) {
            cont +=1;
            System.out.println(cont + ". " + classRoom.getClassroom());
        }
    }

    public void chooseClass(ArrayList<ClassRoom> classes){
        System.out.println("Choose any class: ");
        displayClassData(classes);
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println(classes.get(option-1));
    }
}
