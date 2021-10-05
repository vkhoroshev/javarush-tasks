package quest01.level03.lesson07.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result;
        if (number < 5) {
            result = "число меньше 5";
        } else if (number > 5) {
            result = "число больше 5";
        } else {
            result = "число равно 5";
        }
        System.out.println(result);
    }
}
