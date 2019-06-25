package classes;

import interfaces.Actions;

public class Calculator implements Actions {

    private Reader reader = new Reader();
    private int a;
    private int b;
    private String action;

    public void start() {
        for (; ; ) {
            reader.readNum();
            a = reader.getA();
            b = reader.getB();
            action = reader.getAction();
            switch (action) {
                case "+":
                    System.out.println(add(a, b));
                    break;
                case "-":
                    System.out.println(subtract(a, b));
                    break;
                case "*":
                    System.out.println(multiply(a, b));
                    break;
                case "/":
                    System.out.println(divide(a, b));
                    break;
            }
        }
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return (double) a / b;
    }

}
