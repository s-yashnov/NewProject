package hw7.app;


import java.util.Arrays;
import java.util.Random;

/*
Створіть Java програму, яка виконує наступні завдання:
Створіть масив цілих чисел з 20 елементами.
Заповніть масив випадковими цілими числами в діапазоні від -100 до 100.
Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
Знайдіть та виведіть кількість парних і непарних чисел в масиві.
Знайдіть найбільший та найменший елементи масиву та їхні індекси.
Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
Приклад:
Елементи масиву: [34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8]
Сума від'ємних чисел: -138
Кількість парних чисел: 11
Кількість непарних чисел: 9
Найменший елемент: -50 (з індексом 12)
Найбільший елемент: 99 (з індексом 14)
Середнє арифметичне чисел після першого від'ємного числа: 20.39
 */


public class Main {

    private static final int[] arr = new int[20];

    public static void main(String[] args) {

        generator(arr);
        calcNegative(arr);
        pairNoPair(arr);
        min(arr);
        max(arr);
        average(arr);

    }

    public static void generator(int[] arrays){
        for (int i = 0; i < arrays.length; i++){
            double value = (Math.random() * 201) - 100;
            arrays[i] = (int) value;
        }
        System.out.println("Елементи масиву: " + Arrays.toString(arrays));
    }

    public static void calcNegative(int[] arrays){
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 0) {
                sum += arrays[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + sum);
    }

    public static void pairNoPair(int[] arrays) {
        int pair = 0;
        int noPair = 0;

        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] % 2 == 0){
                pair++;
            } else {
                noPair++;
            }
        }
        System.out.println("Кількість парних чисел: " + pair);
        System.out.println("Кількість непарних чисел: " + noPair);
    }

    public static void min(int[] arrays) {
        int min = arrays[0];
        int index = 0;

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < min) {
                min = arrays[i];
                index = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + index + ")");
    }

    public static void max(int[] arrays) {
        int max = arrays[0];
        int index = 0;

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
                index = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + " (з індексом " + index + ")");
    }

    public static void average(int[] arrays) {
        int index = -1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Від'ємних чисел немає.");
            return;
        }
        for (int i = index + 1; i < arrays.length; i++) {
            sum += arrays[i];
            count++;
        }
        if (count == 0) {
            System.out.println("Після першого від'ємного числа немає елементів.");
            return;
        }
        System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f%n", (double)sum/count);
    }
}
