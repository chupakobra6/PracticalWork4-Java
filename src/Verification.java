import java.util.Scanner;

public class Verification {
    Verification() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя и фамилию:");

        String name = scanner.nextLine();
        String surname = scanner.nextLine();

        Check(name, surname);
    }

    void Check(String name, String surname) {
        if (name.equals("Константин") & surname.equals("Дзюба")) {
            Out(true);
        }
        else {
            Out(false);
        }
    }

    void Out(boolean check) {
        Scanner scanner = new Scanner(System.in);

        if (check) {
            System.out.println("Не врёшь?");
            String choice = scanner.nextLine();
            if (choice.equals("нет")) {
                System.out.println("Поздравляю!");
            }
            else {
                System.out.println(Some());
            }
        }
        else {
            System.out.println(Some());
        }
    }

    String Some() {
        return "Вали отсюда, пока ноги не повыдёргивали!";
    }
}
