import java.util.*;

public class Array_Input_Output {
    public static void main(String[] args){
        System.out.print("Enter Size of an Array : ");
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int[] Number = new int[Size];

        // Loop to take input from user
        for(int i=0; i<Size; i++){
            System.out.print("Enter values for Array : ");
            Number[i] = sc.nextInt();
        }

        // Loop to display the array output
        for(int i=0; i<Size; i++){
            System.out.println(Number[i]);
        }

        sc.close();
    }
}