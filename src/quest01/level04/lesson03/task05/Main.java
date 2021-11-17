package quest01.level04.lesson03.task05;

public class Main {
    public static void main(String[] args) {
        String symbol;

        int x = 0;
        while (x < 10) {
            int y = 0;
            while (y < 20) {
                symbol = "Б";
                if (x != 0 && x != 9) {
                    if (y > 0 && y < 19) {
                        symbol = " ";
                    }
                }
                System.out.print(symbol);
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
