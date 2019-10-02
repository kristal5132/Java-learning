package com.company;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введіть число a =");
        a = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введіть число b =");
        b = in2.nextInt();


        System.out.println("Сума a+b: = " + (a + b));
        System.out.println("Різниця a-b: = " + (a - b) );
        System.out.println("Добуток a*b: = " + (a * b) );
        System.out.println("Частка a/b: = " + (a / b) );
        System.out.println("Остаток від ділення a%b: = " + (a % b) );
    }
}
