package ua.lviv.lgs.interface2;

import ua.lviv.lgs.interface1.Numerable;

public class MyCalculator implements Numerable {

    private int a;
    private int b;
  

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int plus() {
        return a + b;
    }

    @Override
    public int minus() {
        return a - b;
    }
    @Override
    public int multiply(){
        return a * b;
    }
    @Override
    public int devide() {
        return a / b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    
    
}
