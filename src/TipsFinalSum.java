import java.util.Scanner;

public class TipsFinalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите промежуточную сумму:");
        double intermediateSum = input.nextDouble();
        System.out.println("Введите процент чаевых:");
        int tipPercentage = input.nextInt();
        double tips = intermediateSum / 100 * tipPercentage;
        double finalSum = intermediateSum + tips;
        System.out.println("Чаевые: " + tips);
        System.out.println("Итоговая сумма: " + finalSum);
    }
}
