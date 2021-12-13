package com.lizaveta16.task3;

public class Main {

    public static void main(String[] args) {
        double a = 2;
        double b = 4.5;
        double h = 0.5;
        calculateFunction(a, b, h);
    }

    private static void calculateFunction(double a, double b, double h){
        System.out.println("-----------------------------");
        while (a <= b){
            System.out.print("| " + a + "  |");
            double res = Math.tan(a);
            System.out.println(" " + res + " |");
            a += h;
        }
        System.out.println("-----------------------------");
    }
}
