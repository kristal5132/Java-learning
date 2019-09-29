package second.homework;

public class Task_8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int c = i * j;
                System.out.printf(c + " ");
                if (c < 10) {
                    System.out.printf(" ");
                }
                if (j == i) {
                    for (int d = 1; d <= 9 - i; d++)
                        System.out.printf("#" + "  ");
                }
            }
            System.out.println();
        }
    }
}
