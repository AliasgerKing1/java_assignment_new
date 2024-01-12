package assignment10;

import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment10'");
        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If num is divisible by any number between 2 and sqrt(num), it's not prime
            }
        }
        return true; // If no divisors found, num is prime
    }

    }