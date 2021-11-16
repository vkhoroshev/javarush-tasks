package quest01.level04.lesson03.task04;

public class Main {
    public static void main(String[] args) {
        String symbol = "Q";

        int x = 0;
        while (x < 5) {
            int y = 0;
            while (y < 10) {
                System.out.print(symbol);
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
