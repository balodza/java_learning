package n3.arrays;
/*
- написати програму яка рахує середнє значення елементів масиву значення яких є в проміжку [10, 25] та є кратними 3
 */

public class ArrayTask8 {
    public static void main(String[] args) {
        int [] arr = { -5, 0, 1, 2, 3, 5, 28, 6, 8, 11, 56, 87, 54, 34, 21, 9, 80, 81, 90, -100};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            for (int k = 10; k <= 25; k++){
                if (arr[i] == k) {
                    sum += arr[i];
                    count++;
                    System.out.print(arr[i] + " ");
                }
            }
        }
        int avg = sum / count;
        System.out.println(" = " + avg);
    }
}
