package model;

public class Teacher {
    private int id;
    private String name;
    private Double salary;
    private University university;
    private int id_university;
    private Class clase;
    private int id_clase;

    public Teacher(int id, String name, Double salary, Class clase, int id_clase) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.clase = clase;
        this.id_clase = id_clase;
    }

    public void full_Time(int years_experience){
        double salary_original = this.salary;
        System.out.println("Your salary is:" + this.salary);
        this.salary *= (years_experience * 1.1);
        System.out.println("Adding 110% to your " + years_experience + " years of service: " + (salary_original*(years_experience * 1.1)));
        System.out.println("Total: " + this.salary);
    }

    public void part_Time(int hours_per_week){
        this.salary *= hours_per_week;
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
