package assignment4;
// import java.util.Scanner;
public class assignment4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Declare and initialize an array of 10 numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0; 
        int avg = 0;
          for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            avg += numbers[i];
        }
        avg = avg/numbers.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
