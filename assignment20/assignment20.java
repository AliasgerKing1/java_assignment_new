package assignment20;

import java.util.Scanner;

public class assignment20 {
    static void greatestOfThree(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println("First is greatest");
        } else if (second > third && second > first) {
            System.out.println("Second is greatest");
        } else {
            System.out.println("Third is greatest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment20'");
        System.out.print("Enter First Number: ");
        int first_number = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int second_number = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int third_number = sc.nextInt();
        greatestOfThree(first_number, second_number, third_number);
    }
}
