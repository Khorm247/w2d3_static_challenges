package de.neuefische;

public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }

    public static double add(double a, double b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    public static int multiplicate(int a, int b){
        return a * b;
    }
    public static double multiplicate(double a, double b){
        return a * b;
    }

    public static int divide(int a, int b){
        if (b == 0) return 0;
        return a / b;
    }
    public static double divide(double a, double b){
        if (b == 0) return 0;
        return a / b;
    }
}
