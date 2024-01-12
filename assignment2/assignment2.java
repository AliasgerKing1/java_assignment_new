package assignment2;
import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks <= 100){
            if (marks >= 50) {
            System.out.println("PASS");
        }else 
            System.out.println("FAIL");
        }else 
            System.out.println("Marks should be between 0 -100");

    }
}
