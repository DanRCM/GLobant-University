package model;

public class Teacher {
    private int id;
    private String name;
    private Double salary;
    private ClassRoom clase;

    public Teacher(int id, String name, Double salary, ClassRoom clase) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.clase = clase;
    }

    public Teacher(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public Teacher(String name, Double salary, ClassRoom clase) {
        this.name = name;
        this.salary = salary;
        this.clase = clase;
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


    public ClassRoom getClase() {
        return clase;
    }

    public void setClase(ClassRoom clase) {
        this.clase = clase;
    }

    public double calculateSalary(){
        return 0;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "\nid=" + id +
                "\nName='" + name + '\'' +
                "\nSalary=" + salary +
                "\nClass:" + clase;
    }
}
