package assignment3;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even_odd = sc.nextInt();
        if(even_odd % 2 == 0){
            System.out.println("'" + even_odd + "' number is even");

        }else 
            System.out.println("'" +even_odd + "' number is odd");

    }
}
