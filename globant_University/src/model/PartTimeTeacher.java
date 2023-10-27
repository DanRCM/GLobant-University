package model;

public class PartTimeTeacher extends Teacher{
    private int activeHoursPerWeek;
    private int profitPerHour;
    public PartTimeTeacher(int id, String name, Double salary, ClassRoom clase, int activeHoursPerWeek) {
        super(id, name, salary, clase);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public void calculateSalary(){
        System.out.println("Your base salary multiplied for its active hours " +
                "per week: $" + getSalary()*activeHoursPerWeek);
        setSalary(getSalary()*activeHoursPerWeek);
    }
}
