package com.lizaveta16.task2;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        double x = -4;
        double y = -3.1;
        System.out.println(indore(x, y));
    }

    private static boolean indore(double x, double y){
        return (abs(y - 1) <= 4)
                && (((y <= 0) && (abs(x) <= 6)) || ((y > 0) && (abs(x) <= 4)));
    }
}
