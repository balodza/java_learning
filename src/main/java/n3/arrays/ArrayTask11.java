package n3.arrays;

import java.util.Arrays;

public class ArrayTask11 {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 9};
        int[] arr2 = new int[arr.length];
        int[] arr3 = new int[arr.length];
        int k = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i ++){
            if (arr[i]%2 == 0){
                arr2[k] = arr[i];
                k++;
            }else {
                arr3[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
