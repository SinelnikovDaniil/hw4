import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму в десятичном формате:");
        double sum = input.nextDouble();
        double cents = sum * 100;
        int dollars = (int) cents / 100;
        cents %= 100;
        System.out.println("Количество долларов: " + dollars);
        int quarter = (int) cents / 25;
        cents %= 25;
        System.out.println("Количество четвертаков: " + quarter);
        int dime = (int) cents / 10;
        cents %= 10;
        System.out.println("Количество десятицентников: " + dime);
        int nickel = (int) cents / 5;
        cents %= 5;
        System.out.println("Количество никелей: " + nickel);
        int penny = (int) cents;
        System.out.println("Количество пенни:" + penny);
    }
}
