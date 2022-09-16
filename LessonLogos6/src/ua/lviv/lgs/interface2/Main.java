package ua.lviv.lgs.interface2;

public class Main {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator(100,20);
        
        System.out.println("Result plus = " + calculator.plus() );
        System.out.println("Result minus = " + calculator.minus() );
        System.out.println("Result multiply = " + calculator.multiply() );
        System.out.println("Result devide = " + calculator.devide() );

    }

}
