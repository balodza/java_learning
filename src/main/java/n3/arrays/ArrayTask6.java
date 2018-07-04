package n3.arrays;


/*
- написати програму яка рахує суму елементів масиву, які є числами кратними числу 3
*/

public class ArrayTask6 {
    public static void main(String[] args) {
        int [] arr = { -5, 0, 1, 2, 3, 5, 6, 8, 11, 56, 87, 54, 34, 9, 80, 81, 90, -100};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]%3 == 0){
                sum+= arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("/3 = " + sum);
    }
}
