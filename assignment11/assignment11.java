package assignment11;

import java.util.Scanner;

class Animal {
    void makeSound() {
        System.out.println("Some generic Sound!");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}
public class assignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment11'");
        Animal animal = new Animal();
        animal.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}