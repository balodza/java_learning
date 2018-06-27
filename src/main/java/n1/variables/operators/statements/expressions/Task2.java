package n1.variables.operators.statements.expressions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Plese enter values for a variable: ");
        int a = scaner.nextInt();
        System.out.println("Plese enter values for b variable: ");
        int b = scaner.nextInt();
        System.out.println("Plese enter value for c variable: ");
        int c = scaner.nextInt();
        double x1, x2;

        x1 = ((-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))) / (2 * a);
        x2 = ((-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))) / (2 * a);


        System.out.println("--------------------------------------------");
        System.out.println(a + "x^2" + " + " + b+"x +" + c + " = 0" + "\n");
        System.out.println("Square root1: " + x1);
        System.out.println("Square root2: " + x2);
    }
}