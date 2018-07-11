package n2.loops;

import java.util.Scanner;

/*
- написати програму яка виводить в консоль квадрат заданого розміру ( приклад 4 ):
****
****
****
****
використовуючи цикли :
	- while
	- do while
	- while(true)... використовуючи continue/break
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        System.out.println('\n'+"Solution 1");
        // solution 1
        while (counter < number){
            counter++;
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------"+'\n'+"Solution 2");

        //solution 2
        counter = 0;
        do{
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
            counter++;
        } while (counter < number);

        System.out.println("--------------"+'\n'+"Solution 3");

        //solution 3
        counter = 0;
        while (true){
            counter++;
            for (int k = 0; k < number; k++) {
                System.out.print("*");
            }
            if (counter < number){
                System.out.println();
            }else {
                break;
            }
        }

    }
}
