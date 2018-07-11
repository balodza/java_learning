package n3.arrays;

import java.util.Arrays;
/*
- написати програму яка копіює частину масива використовуючи Arrays
 */

public class ArrayTask15 {
    public static void main(String[] args) {
        int [] arr = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};

        int [] newArr = Arrays.copyOfRange(arr, 3, 10);
        System.out.println(Arrays.toString(newArr));
    }
}
