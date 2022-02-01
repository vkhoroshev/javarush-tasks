package quest01.level06.lesson04.task01;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Main {
    public static String[] strings = new String[6];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            if (currentString == null) {
                continue;
            }
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
