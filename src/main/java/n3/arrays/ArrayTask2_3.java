package n3.arrays;

public class ArrayTask2_3 {
    public static void main(String[] args) {
        int [] arr = new int [7];
        arr[0] = 139;
        arr[1] = 20;
        arr[2] = -3;
        arr[3] = 4;
        arr[4] = 59;
        arr[5] = 0;
        arr[6] = 1000;

        int min = arr[0];
        int max = arr[0];

        // display max number
        for (int i = 1; i < arr  .length; i++){
            if ( arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max number is :" + max);

        // display min number
        for (int i = 1; i < arr  .length; i++){
            if ( arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Min number is: " + min);
    }
}
