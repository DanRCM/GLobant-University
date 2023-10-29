package model;

public class Teacher {
    private int id;
    private String name;
    private double salary;
    private ClassRoom clase;

    public Teacher(int id, String name, Double salary, ClassRoom clase) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.clase = clase;
    }

    public Teacher(String name, Double salary, ClassRoom clase) {
        this.name = name;
        this.salary = salary;
        this.clase = clase;
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

    public double getSalary() {
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
