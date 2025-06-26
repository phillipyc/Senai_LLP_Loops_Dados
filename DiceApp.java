import java.util.Scanner;

public class DiceApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
                if (n < 1)
                    n = 1;
            } catch (NumberFormatException e) {
                System.out.println("Parâmetro inválido, usando 1 dado.");
            }
        }

        for (int i = 0; i < n; i++) {
            int face = rollDice();
            System.out.printf("Dado %d: %d%n", i + 1, face);
            System.out.println(drawDice(face));
        }

        scanner.close();
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private static String drawDice(int face) {
        switch (face) {
            case 1:
                return "+-----+\n"
                        + "|     |\n"
                        + "|  o  |\n"
                        + "|     |\n"
                        + "+-----+";
            case 2:
                return "+-----+\n"
                        + "|o    |\n"
                        + "|     |\n"
                        + "|    o|\n"
                        + "+-----+";
            case 3:
                return "+-----+\n"
                        + "|o    |\n"
                        + "|  o  |\n"
                        + "|    o|\n"
                        + "+-----+";
            case 4:
                return "+-----+\n"
                        + "|o   o|\n"
                        + "|     |\n"
                        + "|o   o|\n"
                        + "+-----+";
            case 5:
                return "+-----+\n"
                        + "|o   o|\n"
                        + "|  o  |\n"
                        + "|o   o|\n"
                        + "+-----+";
            case 6:
                return "+-----+\n"
                        + "|o   o|\n"
                        + "|o   o|\n"
                        + "|o   o|\n"
                        + "+-----+";
            default:
                return "";
        }
    }
}