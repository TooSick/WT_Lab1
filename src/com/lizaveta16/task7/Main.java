package com.lizaveta16.task7;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 25, 1, 89, 56, 20, 4, 7};
        shellSort(arr);

        for (int element : arr) {
            System.out.println(element);
        }
    }

    private static void shellSort(int[] a) {
        int len = a.length;
        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                }

                a[j] = temp;
            }
        }
    }
}
