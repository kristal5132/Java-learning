package com.company;
import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        int P=0;
        for (int i = 1; i <= n; i++) {
            P = P + i;
            System.out.println(P);
            }

    }
}
