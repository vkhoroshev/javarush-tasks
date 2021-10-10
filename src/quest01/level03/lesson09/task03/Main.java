package quest01.level03.lesson09.task03;

import java.util.Scanner;

public class Main {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (pass.equalsIgnoreCase(secret)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
