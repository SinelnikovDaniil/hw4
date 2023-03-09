import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите свой вес в фунтах:");
        double weightPounds = input.nextDouble();
        System.out.println("Ведите свой рост в дюймах:");
        double heightInches = input.nextDouble();
        double weightKilograms = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        double bodyMassIndex = weightKilograms / (heightMeters * heightMeters);
        System.out.println("Индекс массы тела = " + bodyMassIndex);
    }
}
