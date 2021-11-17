package quest01.level04.lesson04.task02;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        int number = 0;

        while (number < 100) {
            number++;
            if ((number % 3) == 0) {
                continue;
            }
            result += number;
        }
        System.out.println(result);
    }
}
