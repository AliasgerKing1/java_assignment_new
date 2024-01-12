package assignment7;

import java.util.Scanner;

public class assignment7 {
     static int factorial(int fact) {
        if (fact == 0)
            return 1;
        else
            return fact * factorial(fact - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
    }
}