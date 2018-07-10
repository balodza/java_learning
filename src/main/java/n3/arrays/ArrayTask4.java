package n3.arrays;

/*
- написати програму яка шукає однакові значення масиву ( дублікати )
*/

public class ArrayTask4 {
    public static void main(String[] args) {
        String [] arr = {"qwerty", "txt", "test1", "test2", "nnnnn", "r", "txt", "test3", "ttt", "txt", "txt"};
        boolean dublicate;

        for (int i = 0; i < arr.length; i++) {
            dublicate = false;
            for (int k = 0; k < arr.length; k++){
                if ( i != k && arr[i].equals(arr[k])){
                    dublicate = true;
                }
            }
            if (dublicate){
                System.out.println(arr[i] +" with index "+ "\"" + i + "\"" + " has dublicates in array.");
            }
        }
    }
}
