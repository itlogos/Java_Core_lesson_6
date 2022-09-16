package ua.lviv.lgs.salary;

public class EmployeeSalaryMonthly implements Salary {

    @Override
    public int salary() {
        return SALARYMONTHLY + BONUS;
    }

}
