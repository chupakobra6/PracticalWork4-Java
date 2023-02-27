import java.util.Scanner;

public class Verification {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String surname;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    Verification() {
        System.out.println("Введите своё имя и фамилию:");

        name = scanner.nextLine();
        surname = scanner.nextLine();

        Check(name, surname);
    }

    void Check(String name, String surname) {
        Out(name.equals("Константин") & surname.equals("Дзюба"));
    }

    void Out(boolean check) {
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
