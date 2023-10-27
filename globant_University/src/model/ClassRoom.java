package model;

import java.util.ArrayList;

public class ClassRoom {
    private String name;
    private String classroom;
    private ArrayList<Student> students;
    private Teacher teacher;

    public ClassRoom(String name, String classroom, ArrayList<Student> students, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.students = students;
        this.teacher = teacher;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "\nName='" + name + '\'' +
                "\nClassroom='" + classroom + '\'' +
                "\nTeacher: " + teacher.getName() +
                "\nStudents= " + students;

    }
}
