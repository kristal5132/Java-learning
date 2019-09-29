package second.homework;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int enteredNumber = in.nextInt();
        int result = 0;
        for (int i = 0; i <= enteredNumber; i++) {
            result = result + i;
        }
        System.out.println("The sum of your arithmetic row is: " + result);
        in.close();
    }
}
