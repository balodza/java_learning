package n3.arrays;

import java.util.Arrays;

public class ArrayTask12 {
    public static void main(String[] args) {
        int[] arr = {0, -5, 2, 1, 3, 5, 28, 6, 8, 11, 56, 9};
        int i, k, temp;


        for (i = 0; i < arr.length; i++){
            for (k = i+1; k < (arr.length); k++){
                if (arr[k] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
