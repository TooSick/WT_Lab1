package com.lizaveta16.task5;

import static java.lang.Math.max;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] {13, 2, 4, 15, 5, -2, -7, 7, 40};
        System.out.println(findNumberOfExtra(a));
    }

    private static int findNumberOfExtra(int[] a) {
        if (a == null) {
            return -1;
        }

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (a[j] < a[i]) {
                    b[i] = max(b[i], 1 + b[j]);
                }
            }

        }

        int res = b[0];
        for (int i = 0; i < a.length; i++) {
            res = max(res, b[i]);
        }

        return a.length - res;
    }
}
