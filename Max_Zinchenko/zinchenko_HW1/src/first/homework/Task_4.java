package first.homework;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        float length = in.nextFloat();
        System.out.print("Input B: ");
        float width = in.nextFloat();
        System.out.print("Input H: ");
        float height = in.nextFloat();
        float volume = length * width * height;
        System.out.printf("Volume = %.2f", volume);
        in.close();
    }
}
