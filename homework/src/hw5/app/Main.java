package hw5.app;

/*

Доходи оподатковуются за прогресивною шкалою оподаткування:

від 0 до 10000, включно, за ставкою 2,5%.
від 10000, виключно, до 25000, включно, за ставкою 4,3%.
більше 25000, за ставкою 6,7%.
Необхідно розрахувати суму податку від певної суми доходу. Сума податку дорівнює відсотку від суми доходу.

(1) Створіть окремий проект.

(2) В проекті створіть пакет app , де створіть клас Main .

(3) В класі Main реалізуйте функціонал розрахунку суми податку.

(4) Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

 */

import java.util.Scanner;

public class Main {

    private static final double LOW_TAX_RATE = 0.025;
    private static final double MIDDLE_TAX_RATE = 0.043;
    private static final double HIGH_TAX_RATE = 0.067;

    private static final int FIRST_LIMIT = 10_000;
    private static final int SECOND_LIMIT = 25_000;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your income: ");
        double income = SCANNER.nextDouble();

        double tax = calculateTax(income);

        System.out.printf("Tax: %.2f%n", tax);
    }

    public static double calculateTax(double income) {

        if (income <= FIRST_LIMIT) {
            return income * LOW_TAX_RATE;
        }

        if (income <= SECOND_LIMIT) {
            return FIRST_LIMIT * LOW_TAX_RATE
                    + (income - FIRST_LIMIT) * MIDDLE_TAX_RATE;
        }

        return FIRST_LIMIT * LOW_TAX_RATE
                + (SECOND_LIMIT - FIRST_LIMIT) * MIDDLE_TAX_RATE
                + (income - SECOND_LIMIT) * HIGH_TAX_RATE;
    }
}
