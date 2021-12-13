package com.lizaveta16.task8;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 5, 12, 60 };
        int[] b = new int[] { 0, 9, 70 };
        makeNewSequence(a, b);
    }

    private static void makeNewSequence(int[] a, int[] b) {
        int i = 0;
        for (int elB : b) {
            while (i < a.length) {
                if (elB <= a[i]) {
                    break;
                }
                System.out.printf("%d ", a[i]);
                i++;
            }
            System.out.printf("%d(from b) ", elB);
        }

        while (i < a.length) {
            System.out.printf("%d ", a[i]);
            i++;
        }
    }
}
