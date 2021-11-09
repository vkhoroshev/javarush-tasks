package quest01.level04.lesson03.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                result = result + scanner.nextInt();
            } else {
                isExit = scanner.nextLine().equals("ENTER");
            }
        }
        System.out.println(result);
    }
}
