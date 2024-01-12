package assignment14;

import java.util.Scanner;

abstract class Shape {
 // Abstract method for calculating area
    abstract double calculateArea();

    // Abstract method for displaying information about the shape
    abstract void displayInfo();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayInfo() {
        System.out.println("Circle - radius: " + radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
        void displayInfo() {
        System.out.println("Rectangle - length: " + length + ", Rectangle - width: " + width);
    }

}

public class assignment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment14'");

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        // Calling abstract methods on instances
        System.out.println("Area of Circle: " + circle.calculateArea());
        circle.displayInfo();

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        rectangle.displayInfo();
    }
}