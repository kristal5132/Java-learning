package second.homework;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        short changed = (short)number;
        if (changed > 0) {
            if ((changed % 2) == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        else {
            System.out.println("Error: Entered number < 0");
        }
        in.close();
    }
}
