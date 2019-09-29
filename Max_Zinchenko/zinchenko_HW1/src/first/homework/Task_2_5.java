/*
2 in 1
Here is Task 2 and Task 5(*)
*/

package first.homework;

import java.util.Scanner;

public class Task_2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input X: ");
        int x = in.nextInt();
        System.out.print("Input Y: ");
        int y = in.nextInt();

        int sum = x + y;
        int diff = x - y;
        int prod = x * y;
        int rem = x % y;

        System.out.printf("\nSum of the entered numbers:\t\t\t %d\nDifference of the entered numbers:\t %d\nProduct of the entered numbers:\t\t %d\nRemainder of the division:\t\t\t %d\n", sum, diff, prod, rem);
        in.close();
    }
}
