package com.lizaveta16.task1;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        double x = 7.5;
        double y = -3.2;
        System.out.println(calculateFunction(x, y));
    }

    private static double calculateFunction(double x, double y){
        return 1 + (pow(sin(x + y), 2))
                /(2 + abs(x - 2*x/(1+x*x*y*y))) + x;
    }
}
