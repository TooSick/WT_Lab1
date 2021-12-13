package com.lizaveta16.task6;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        int[][] matrix = createMatrix(a);
        printMatrix(matrix);
    }

    private static int[][] createMatrix(int[] a) {
        int[][] matrix = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                matrix[i][j] = a[(j + i) % a.length];
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%d ", num);
            }

            System.out.println();
        }
    }
}
