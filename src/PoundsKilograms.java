import java.util.Scanner;

public class PoundsKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество фунтов:");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println("Количество килограммов: " + kilograms);
    }
}
