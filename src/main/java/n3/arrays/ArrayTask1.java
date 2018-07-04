package n3.arrays;

/* - написати програму яка рахує кількість входження заданого слова в масиві */

public class ArrayTask1 {
    public static void main(String[] args) {

        String [] arr = {"tfjf", "txt", "wekjfwer", "frfr", "nnnnn", "r", "txt", "ewf", "ttt", "txt", "txt"};
        String a = "txt";
        int counter = 0;

        for (String i:arr) {

            if (i.equals(a)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
