package assignment6;

import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        String grade ="";
        if (marks >= 90 && marks <= 100) {
            grade = "Excellent";
        }
        else if (marks >= 70 && marks < 90) {
            grade = "V good";
        }
        else if (marks >= 45 && marks < 70) {
            grade = "good";
        }
        else if (marks >= 33 && marks < 45) {
            grade = "Need improvement";
        }
        else if (marks < 33) {
            grade = "Fail";
        }
        else {
            grade = "not valid Marks";
        }
        System.out.println(grade);
    }
}