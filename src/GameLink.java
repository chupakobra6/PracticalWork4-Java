import java.util.Scanner;

public class GameLink {
    GameLink() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название игры для получения ссылки:");

        String name = scanner.nextLine();
        Check(name);
    }

    void Check(String name) {
        if (name.equals("Overlord") | name.equals("Overlord 2") | name.equals("Overlord: Raising Hell")) {
            GetLink(name);
        }
        else {
            System.out.println("Иди лучше полезным займись чем-нибудь!");
        }
    }

    void GetLink(String name) {
        if (name.equals("Overlord") | name.equals("Overlord: Raising Hell")) {
            System.out.println("Ссылка - https://itorrents-igruha.org/1141-overlord.html");
        }
        if (name.equals("Overlord 2")) {
            System.out.println("Ссылка - https://itorrents-igruha.org/984-overlord-2.html");
        }
    }
}
