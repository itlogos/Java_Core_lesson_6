package ua.lviv.lgs.salary;

public class Main {

    public static void main(String[] args) {

        EmployeeSalaryHourly employeeHourly = new EmployeeSalaryHourly();
        EmployeeSalaryMonthly employeeMonthly = new EmployeeSalaryMonthly();

        System.out.println("Погодинна зарплата " + employeeHourly.salary() + " грн.");
        System.out.println("Місячна зарплата " + employeeMonthly.salary() + " грн.");

    }

}
