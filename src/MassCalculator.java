import java.util.Scanner;

public class MassCalculator {
    Scanner scanner = new Scanner(System.in);
    private double volume = 0;
    private double p = 0;
    private double mass = 0;

    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getP() {
        return p;
    }
    public void setP(double p) {
        this.p = p;
    }
    public double getMass() {
        return mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }

    MassCalculator() {
        System.out.println("Формула массы: V*p - произведение объёма на плотность\n Введите объём (м^3) и плотность (кг/м^3):");

        try {
            volume = scanner.nextDouble();
            p = scanner.nextDouble();
        }
        catch (Exception ex) {
            System.out.println("Введено неверное значение!");
            System.exit(0);
        }

        Check(volume, p);
        Calculator(volume, p);
    }

    void Check(double volume, double p) {
        if (volume <= 0 ) {
            System.out.println("Объём не может быть <= 0");
        }
        else if (p <= 0) {
            System.out.println("Плотность не может быть <= 0");
        }
        else {
            String result = Calculator(volume, p);
            System.out.println(result);
        }
    }

    String Calculator(double volume, double p) {
        try {
            mass = volume * p;
        }
        catch (Exception ex) {
            System.out.println("Ошибка в вычислениях!");
        }

        return  "Результат: " + mass;
    }
}
