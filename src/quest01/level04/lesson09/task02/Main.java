package quest01.level04.lesson09.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double z = (1.0 * x) / y;
        System.out.println(z);
    }
}
