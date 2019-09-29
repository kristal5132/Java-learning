package second.homework;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a last number: ");
        int lastNumber = in.nextInt();
        System.out.print("Enter a number for divide: ");
        int divideNumber = in.nextInt();
        if (lastNumber > divideNumber) {
            for (int i = 1; i <= lastNumber; i++) {
                if ((i % divideNumber) == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Error: The last number is greater than the division number");
        }
        in.close();
    }
}
