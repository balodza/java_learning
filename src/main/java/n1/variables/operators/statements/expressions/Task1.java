package n1.variables.operators.statements.expressions;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter a number and click Enter:");
        Scanner scaner = new Scanner(System.in);
        String switchCondition = "";

        // first solution:
        int number = scaner.nextInt();

        if (number < 100){
            switchCondition = "too less";
            System.out.println("too less");
        }

        if (number >= 100 && number <= 100500){
            switchCondition = "its okay";
            System.out.println("its okay");
        }

        if (number > 100500){
            switchCondition = "too big";
           System.out.println("too big");
        }
        System.out.println("==================================");

        // second solution:
        if (number < 100){
            System.out.println("too less");
        }else if (number >= 100 && number <= 100500){
            System.out.println("its okay");
        }else{
            System.out.println("too big");
        }
        System.out.println("==================================");

        // third solution:
        switch (switchCondition) {
            case "too less":
                System.out.println(switchCondition);
                break;
            case "its okay":
                System.out.println(switchCondition);
                break;
            case "too big":
                System.out.println(switchCondition);
                break;
        }
        System.out.println("==================================");

    }
}
