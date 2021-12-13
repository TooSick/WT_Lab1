package com.lizaveta16.task4;

import java.util.ArrayList;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5 , 6, 7, 8, 9, 10};
        int[] primeNumbersIndexes;
        if ((primeNumbersIndexes = getPrimeNumbersIndexes(arr)).length > 0) {
            for (int i = 0; i < primeNumbersIndexes.length; i++) {
                System.out.println(primeNumbersIndexes[i]);
            }
        }
        else {
            System.out.println("No prime numbers");
        }
    }

    private static int[] getPrimeNumbersIndexes(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
