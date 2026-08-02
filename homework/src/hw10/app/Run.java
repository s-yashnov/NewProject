package hw10.app;
import hw10.services.ArrayService;
import hw10.services.MathService;
import hw10.services.StringService;

import java.util.Scanner;

import static hw10.services.MathService.cylinderVolume;

public class Run {

    //Menu

    /*
    1. Визначити квадрат числа
    2. Визначити об'єм циліндра
    3. Визначити суму елементів масиву
    4. Переписати рядок в зворотньому напрямку
    5. Визначити число у степені n
    6. Вивести текст n кількість разів

     */

    private static final Scanner s = new Scanner(System.in);

    public static void run() {

        System.out.println("МЕНЮ: \n" +
                "1. Визначити квадрат числа\n" +
                "2. Визначити об'єм циліндра\n" +
                "3. Визначити суму елементів масиву\n" +
                "4. Переписати рядок в зворотньому напрямку\n" +
                "5. Визначити число у степені n\n" +
                "6. Вивести текст n кількість разів\n" +
                "0. Вихід\n");

        while (true) {
            System.out.print("Оберіть пункт меню: ");
            int menu = s.nextInt();
            switch (menu) {
                case 1 -> MathService.toSquare();
                case 2 -> {
                    System.out.print("Введіть значення радіуса: ");
                    double rad = s.nextDouble();
                    System.out.print("Введіть значення висоти: ");
                    double height = s.nextDouble();
                    MathService.cylinderVolume(rad, height);
                }
                case 3 -> {
                    System.out.print("Введіть розмір масиву: ");
                    int size = s.nextInt();
                    int[] array = ArrayService.createArray(size);
                    ArrayService.fillArray(array);
                    ArrayService.print(array);
                    System.out.println("Сума всіх елементів масиву дорівнює: " + ArrayService.sumArray(array));

                }
                case 4 -> {
                    System.out.println("ЗАДОМ НАПЕРЕД");
                    s.nextLine();
                    System.out.print("Введіть початкову строку: ");
                    String str = s.nextLine();
                    String reversed = StringService.reverseString(str);
                    StringService.printSting(reversed);
                }
                case 5 -> {
                    System.out.println("ПІДНЕСЕННЯ ДО СТЕПЕНЯ");
                    System.out.print("Введіть a: ");
                    int base = s.nextInt();
                    System.out.print("Введіть b: ");
                    int exp = s.nextInt();
                    int result = MathService.pow(base, exp);
                    System.out.println("Результат " + base + "^" + exp + " дорівнює " + result + ".");

                }
                case 6 -> {
                    System.out.println("ДУБЛЮВАННЯ ТЕКСТУ");
                    System.out.print("Введіть ціле число n: ");
                    int count = s.nextInt();
                    s.nextLine();
                    System.out.print("Введіть текстовий рядок: ");
                    String text = s.nextLine();
                    StringService.multiString(count, text);
                }
                case 0 -> {
                    System.out.println("Робота програми завершена");
                    return;
                }
                default -> {
                    System.out.println("Ви ввели невірне число");
                    return;
                }
            }

        }
    }
}
