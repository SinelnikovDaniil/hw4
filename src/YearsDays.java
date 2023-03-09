import java.util.Scanner;

public class YearsDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество минут:");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        System.out.println("Количество дней: " + days);
        System.out.println("Количество лет: " + years);
    }
}
