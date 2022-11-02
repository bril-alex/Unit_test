package org.example;

public class Matrix_square {
    public static boolean isSquare(int[][] arrays) {
        boolean square = true;
        for (int[] arr : arrays) {
            if (arrays.length == arr.length) {
                square = true;
            } else {
                square = false;
            }
        }
        return square;
    }
}
