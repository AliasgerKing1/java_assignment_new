package assignment13;

import java.util.Scanner;

public class assignment13 {
    static int volume(int s) {
            return s * s * s;
    }
    static int volume(int l, int b, int h) {
            return l * b * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment13'");
            System.out.println("Volume of cube: " + volume(50));
            System.out.println("Volume of cuboid: " + volume(50, 70, 10));
    }
}