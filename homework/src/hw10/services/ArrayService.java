package hw10.services;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayService {
    private static final Scanner s = new Scanner(System.in);
    private static final Random rand = new Random();

    public static int sumArray(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }

    public static void fillArray(int[] arr) {
        System.out.println("Введіть діапазон значень, якими буде заповнено масив.");
        int firstValue;
        while (true) {
            System.out.print("Введіть нижню межу значень: ");
            if (!s.hasNextInt()) {
                System.out.println("ПОМИЛКА!!! Ви ввели не число.");
                s.next();
                continue;
            }
            firstValue = s.nextInt();
            break;
        }
        int secondValue;
        while (true) {
            System.out.print("Введіть верхню межу значень: ");
            if (!s.hasNextInt()) {
                System.out.println("ПОМИЛКА!!! Ви ввели не число.");
                s.next();
                continue;
            }
            secondValue = s.nextInt();
            break;
        }
        if (firstValue > secondValue) {
            System.out.println("ПОМИЛКА!!! Нижня межа більша за верхню!");
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(firstValue, secondValue + 1);
            }
        }
    }

    public static int[] createArray(int size) {
        int[] arr = new int[size];
        return arr;
    }

    public static void print(int[] arr) {
        System.out.println("Масив чисел: " + Arrays.toString(arr));
    }
}

