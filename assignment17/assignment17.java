package assignment17;

import java.util.Scanner;
class Example {
    int first;
    int second;
    public Example(int first, int second) {
        this.first = first;
        this.second = second;
    }
    public void display() {
        System.out.println("First value: " + first);
        System.out.println("Second value: " + second);
    }
}
public class assignment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment17'");

        Example example1 = new Example(30, 70);
        example1.display();
        Example example2 = new Example(90, 40);
        example2.display();


        
    }
}