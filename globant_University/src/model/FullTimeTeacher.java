package model;

public class FullTimeTeacher extends Teacher implements TeachingRole{
    private int experienceYears;
    public FullTimeTeacher(int id, String name, Double salary, ClassRoom clase, int experienceYears) {
        super(id, name, salary, clase);
        this.experienceYears = experienceYears;
        setSalary(calculateSalary());
    }

    @Override
    public double calculateSalary(){
        double salary_final;
        salary_final = getSalary() * (experienceYears * 1.1);
        return salary_final;
    }
}
