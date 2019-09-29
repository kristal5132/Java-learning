package first.homework;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String firstName = in.nextLine();
        System.out.print("Input Surname: ");
        String secondName = in.nextLine();
        System.out.print("Input phone number: ");
        String phoneNumber = in.nextLine();
        System.out.print("Input place of study/work: ");
        String workPlace = in.nextLine();
        System.out.printf("\nName:\t\t\t\t\t %s\nSurname:\t\t\t\t %s\nPhone number:\t\t\t %s\nPlace of study/work: \t %s\n", firstName, secondName, phoneNumber, workPlace);
        in.close();
    }
}
