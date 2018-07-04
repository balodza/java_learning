package n3.arrays;

import java.util.Arrays;

/*
- написати програму яка друкує всі елементи із значень матриці ( двовимірного масиву int[][] arr = ... )
 */

public class ArrayTask16 {
    public static void main(String[] args) {
        int i, k;
        int[][] arr = {{5, 6, 1, 3}, {3, 4, 2, 1}, {1, 2, 2, 2}};

        for (i = 0; i < arr.length; i++) {
            for (k = 0; k < arr.length; k++) {
                System.out.print(arr[i][k] + " ");
            }

            System.out.println(arr[i][k] + " ");
        }
    }
}

