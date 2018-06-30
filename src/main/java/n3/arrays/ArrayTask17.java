package n3.arrays;

import java.util.Arrays;

public class ArrayTask17 {
    public  static int index = 0, numOfArrays = 3, k, j, g;

    public static void main(String[] args) {
        int [] arr1 = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};
        int [] arr2 = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};
        int [] arr3 = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};

        System.out.println(Arrays.toString(getSumOfArrays(arr1, arr2, arr3)));

    }

    public static int [] getSumOfArrays(int [] a, int [] b, int [] c){
        int [] newArr = new int[a.length + b.length + c.length];

        for (k = 0; k < a.length; k++){
            newArr[index] = a[k];
            index++;
        }

        for (j = 0; j < b.length; j++){
            newArr[index] = b[j];
            index++;
        }

        for (g = 0; g < c.length; g++){
            newArr[index] = c[g];
            if (index != (newArr.length - 1)) {
                index++;
            }
        }
        return newArr;
    }
}
