package quest01.level03.lesson05.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean equal12 = number1 == number2;
        boolean equal13 = number1 == number3;
        boolean equal23 = number2 == number3;

        if (equal12) {
            System.out.print(number1 + " " + number2);
            if (equal13) {
                System.out.print(" " + number3);
            }
        } else if (equal13) {
            System.out.print(number1 + " " + number3);
        } else if (equal23) {
            System.out.print(number2 + " " + number3);
        }
    }
}
