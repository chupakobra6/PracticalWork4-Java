import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите класс для взаимодействия:\n 1 - MassCalculator\n 2 - Verification\n 3 - GameLink\n 4 - Выход");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            try {
                choice = scanner.nextInt();
            }
            catch (Exception ex) {
                System.out.println("Введено неверное значение!");
                System.exit(0);
            }

            if (choice == 1) {
                MassCalculator masscalc = new MassCalculator();
            }
            else if (choice == 2) {
                Verification yes = new Verification();
            }
            else if (choice == 3) {
                GameLink link = new GameLink();
            }
            else if (choice == 4) {
                break;
            }
            else {
                System.out.println("Введено неверное значение!");
                System.exit(0);
            }
        } while (true);
    }
}