package n2.loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        System.out.println('\n'+"Solution 1");
        // solution 1
        while (counter1 < number){
            counter1++;
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------"+'\n'+"Solution 2");

        //solution 2
        do{
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
            counter2++;
        } while (counter2 < number);

        System.out.println("--------------"+'\n'+"Solution 3");

        //solution 3
        while (true){
            counter3++;
            for (int k = 0; k < number; k++) {
                System.out.print("*");
            }
            if (counter3 < number){
                System.out.println();
                continue;
            }else {
                break;
            }
        }

    }
}
