package n3.arrays;

import java.util.Arrays;

/*
- написати програму яка копіює задану частину масиву в інший масив ( наприклад елементи з 3го по 10й )
 */

public class ArrayTask13 {
    public static void main(String[] args) {
        int [] arr = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};
        int a = 3, b = 10, k = 0, i;

         if(a < 0 || b >= arr.length) {
             System.out.println("Pls check your input numbers.");
         }else if(a > b){
             System.out.println("Pls check your input numbers.");
         } else {
             int[] arr2 = new int[(b - a) + 1];
             for(i = a; i <= b; i++){
                    arr2[k++] = arr[i];
                }
             System.out.println(Arrays.toString(arr2));
            }
    }
}


