package quest01.level03.lesson03.task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
