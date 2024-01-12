package assignment15;

import java.util.Scanner;

interface Moveable {
    boolean isMoveable();
}
interface Rollable {
    boolean isRollable();
}

class Tyre implements Moveable, Rollable {
    public boolean isMoveable() {
        return true;
    }
    public boolean isRollable() {
        return true;
    }
}
public class assignment15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment15'");

        Tyre tyre = new Tyre();
        System.out.println(tyre.isMoveable());
        System.out.println(tyre.isRollable());
    }
}