package model;

public class FullTimeTeacher extends Teacher{
    private int experienceYears;

    public FullTimeTeacher(int id, String name, Double salary, ClassRoom clase, int experienceYears) {
        super(id, name, salary, clase);
        this.experienceYears = experienceYears;
    }

    @Override
    public void calculateSalary(){
        double salary_final;
        System.out.println("Your salary is:" + getSalary());
        salary_final = getSalary() * (experienceYears * 1.1);
        System.out.println("Adding 110% to your " + experienceYears + " years of service: " + (getSalary()*(experienceYears * 1.1)));
        System.out.println("Total: $" + salary_final);
        setSalary(salary_final);
    }
}
