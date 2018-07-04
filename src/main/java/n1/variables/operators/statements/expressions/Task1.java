package n1.variables.operators.statements.expressions;

import java.util.Scanner;


/*- написати програму яка присвоює змінній типу String значення на основні змінної типу int:
	"too less" : коли значення заданої змінної менші чим 100
	"its okay" : коли значення заданої змінної в межах [100, 100500]
	"too big"  : коли значення заданої змінної більші чим 100500
	використовуючи:
	- if.. if ... if ...
	- if .. else if ... else
	- switch(...) ... case1... case2 ... */

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
