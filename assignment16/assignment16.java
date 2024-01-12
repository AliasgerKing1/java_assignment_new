package assignment16;

import java.util.Scanner;

import assignment16.Package_class.Package_class;

public class assignment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment16'");
        Package_class package_class = new Package_class();
        package_class.displayMessage();
    }
}