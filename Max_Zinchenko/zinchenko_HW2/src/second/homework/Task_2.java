package second.homework;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many times to write the text? ");
        int lastNumber = in.nextInt();
        for (int i = 0; i < lastNumber; i++) {
            System.out.println("I will adopt best practices");
        }
        in.close();
    }
}
