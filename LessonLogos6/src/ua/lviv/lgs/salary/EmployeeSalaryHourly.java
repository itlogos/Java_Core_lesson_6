package ua.lviv.lgs.salary;

public class EmployeeSalaryHourly implements Salary {

    @Override
    public int salary() {
        return HOURLYWAGE * HOURS;
    }
}
