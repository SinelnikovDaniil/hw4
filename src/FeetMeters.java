import java.util.Scanner;

public class FeetMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество футов:");
        double feet = input.nextDouble();
        double meters = feet * 0.305;
        System.out.println("Количество метров: " + meters);
    }
}
