package assignment5;

import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int reversedNumber = 0;
        int num = sc.nextInt();  
        while(num != 0)   
    {  
            int remainder = num % 10;  
            reversedNumber = reversedNumber * 10 + remainder;
            num = num/10;    
        }
        System.out.println("Reversed number: " + reversedNumber);
}
}