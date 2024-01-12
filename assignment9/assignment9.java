package assignment9;

public class assignment9 {
    public static void main(String[] args) {
        int[] table_numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int table_number : table_numbers) {
            for(int i = 1; i < 11; i++) {
                System.out.println(table_number + " x " + i + " = " + table_number*i);
            }
            System.out.println("\n");

        }
        
    }
}