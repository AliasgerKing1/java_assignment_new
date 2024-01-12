package assignment12;

import java.util.ArrayList;
import java.util.Scanner;

public class assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Process happening in child program 'assignment12'");
        System.out.print("Enter String: ");
        String user_str = sc.nextLine();
        String[] user_array = user_str.split(" ");
        // Using ArrayList to dynamically add elements
        ArrayList<String> tempArrayList = new ArrayList<>();

        for (String eachArrayItem : user_array) {
            tempArrayList.add(eachArrayItem.toUpperCase());
            // tempArrayList.add(eachArrayItem.toLowerCase());
        }

        // Convert ArrayList back to an array if needed
        String[] tempArray = tempArrayList.toArray(new String[0]);
        // Convert the array to a single string
        String resultString = String.join(" ", tempArray);

        // Print the modified string
        System.out.println(resultString);
    }
}