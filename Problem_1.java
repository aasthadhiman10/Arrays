// PROBLEM: Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        String[] Names = new String[size];

        // Loop to accept names from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name : ");
            Names[i] = sc.next();
        }

        
        for (int i = 0; i < size; i++) {
            System.out.println("Name " + (i + 1) + " is : " + Names[i]);
        }

        sc.close();
    }
}