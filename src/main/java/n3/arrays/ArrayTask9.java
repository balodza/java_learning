package n3.arrays;

import java.util.Arrays;

public class ArrayTask9 {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 9};
        int toRemove = 9;
        int counter = 1;
        int arrSizeDiff = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toRemove){
                if (arr[arr.length - counter] != toRemove){
                arr[i] = arr[arr.length - counter];
                counter++;
                arrSizeDiff++;
                } else {
                    while (arr[arr.length - counter] == toRemove){
                        counter++;
                        arrSizeDiff++;
                    }
                    arr[i] = arr[arr.length - (counter)];
                }
            }
        }
        System.out.println("Primary array length is " + arr.length);

        int [] newArr = new int [arr.length - arrSizeDiff];
        for ( int k = 0; k < newArr.length; k++){
            newArr[k] = arr[k];
        }
        System.out.println("New array length is " + newArr.length);
        System.out.println(Arrays.toString(newArr));
    }
}