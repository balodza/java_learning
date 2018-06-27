package n3.arrays;

public class ArrayTask4 {
    public static void main(String[] args) {
        String [] arr = {"tfjf", "txt", "wekjfwer", "frfr", "nnnnn", "r", "txt", "ewf", "ttt", "txt", "txt"};
        boolean dublicate;

        for (int i = 0; i < arr.length; i++) {
            dublicate = false;
            for (int k = 0; k < arr.length; k++){
                if ( i != k && arr[i] == arr[k]){
                    dublicate = true;
                    continue;
                }
            }
            if (dublicate){
                System.out.println(arr[i] +" with index "+ "\"" + i + "\"" + " has dublicates in array.");
            }
        }
    }
}
