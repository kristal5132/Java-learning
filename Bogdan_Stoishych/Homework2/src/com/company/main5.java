package com.company;
import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in2.nextInt();

        for(int i = 1; i <= n; i++ ) {
            if (m % i == 0) {
                System.out.println("i = " + i);
            }
        }
    }
}
