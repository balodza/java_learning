package n3.arrays;

import java.util.Arrays;

public class ArrayTask10 {
    public static void main(String[] args) {
        String [] arr = {"qwerty", "txt", "test1", "test2", "nnnnn", "r", "txt", "test3", "ttt", "txt", "txt"};
        String [] newArr = new String[arr.length];
        int counter = 0;

        for (int k = newArr.length - 1; k >= 0; k-- ){
            newArr[k] = arr[counter++];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
