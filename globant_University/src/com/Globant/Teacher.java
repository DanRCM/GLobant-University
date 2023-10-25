package com.Globant;
/*Java Basics Module Final Exercise I want to make a system to track my university
classes, teachers and students. Each Teacher has a name, and a salary
calculated by the following rules:
● For the full time teachers: base salary (attribute) multiplied by 110%
of its experience years.
● For part time teachers: base salary multiplied for its active hours
per week.
The university includes a list of teachers, a list of students
and a list of classes. Each class has a name, an assigned classroom, a
list of students and a teacher. Every student has his name, id, and age.
*/
public class Teacher {
    int id;
    String name;
    Double salary;
    University university;
    int id_university;
    Class clase;
    int id_clase;


    public Teacher(int id, String name, Double salary, Class clase, int id_clase) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.clase = clase;
        this.id_clase = id_clase;
    }

    public void full_Time(int years_experience){
        double add;
        double salary_original = this.salary;

        add = salary_original * (years_experience * 1.1);
        this.salary += add;
        System.out.println("Your salary is:" + salary_original);
        System.out.println("Adding 110% to your years of service: " + (salary_original*(years_experience * 1.1)));
        System.out.println("Total: " + this.salary);
    }

    public void part_Time(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public int getId_university() {
        return id_university;
    }

    public void setId_university(int id_university) {
        this.id_university = id_university;
    }

    public Class getClase() {
        return clase;
    }

    public void setClase(Class clase) {
        this.clase = clase;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }
}
