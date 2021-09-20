package quest01.level02.lesson08.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
