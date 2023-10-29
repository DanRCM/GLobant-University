package model;

public class PartTimeTeacher extends Teacher implements  TeachingRole{
    private int activeHoursPerWeek;
    public PartTimeTeacher(int id, String name, Double salary, ClassRoom clase, int activeHoursPerWeek) {
        super(id, name, salary, clase);
        this.activeHoursPerWeek = activeHoursPerWeek;
        setSalary(calculateSalary());
    }

    @Override
    public double calculateSalary(){
        return getSalary()*activeHoursPerWeek;
    }
}
