package org.example;

public class Matrix_average {
    public static double average(int[] average_numbers) {
        double average = 0;
        double sum = 0;
        for (int a = 0; a < average_numbers.length; a++) {
            sum += average_numbers[a];
           average = sum / average_numbers.length;
        }
        return average;
    }
}
