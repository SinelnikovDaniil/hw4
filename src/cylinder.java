import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус цилиндра:");
        double radius = input.nextDouble();
        System.out.println("Введите длину цилиндра:");
        double lenght = input.nextDouble();
        double area = radius * radius * 3.1415;
        double volume = area * lenght;
        System.out.println("Площадь цилиндра = " + area);
        System.out.println("Объем цилиндра = " + volume);
    }
}
