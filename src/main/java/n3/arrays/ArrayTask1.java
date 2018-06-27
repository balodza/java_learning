package n3.arrays;

public class ArrayTask1 {
    public static void main(String[] args) {

        //
        String [] arr = {"tfjf", "txt", "wekjfwer", "frfr", "nnnnn", "r", "txt", "ewf", "ttt", "txt", "txt"};
        String a = "txt";
        int counter = 0;

        for (String i:arr) {

            if (i == a){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
