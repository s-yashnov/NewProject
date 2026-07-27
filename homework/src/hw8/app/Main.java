package hw8.app;


/*
Створіть Java програму, яка виконує наступні завдання, використовуючи одновимірний масив:
1. Створіть масив цілих чисел з 15 елементами.
2. Заповніть масив випадковими цілими числами в діапазоні від 1 до 100.
3. Виведіть початковий вигляд масиву.
4. Відсортуйте масив за допомогою алгоритму сортування вставкою (Insertion Sort) в порядку зростання.
5. Виведіть відсортований масив.
6. Попросіть користувача ввести число для пошуку в масиві.
7. Використовуючи алгоритм бінарного пошуку, знайдіть і виведіть індекс введеного користувачем числа у відсортованому масиві або повідомте, якщо числа немає.
8. Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
Приклад:
Початковий вигляд масиву: [45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91]
Відсортований масив: [2, 7, 12, 23, 32, 34, 41, 45, 55, 65, 67, 78, 88, 91, 98]
Введіть число для пошуку: 34
Індекс числа 34 у відсортованому масиві: 5
 */


import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.random;

public class Main {

    // task_1
    private static final int[] arr = new int[15];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // task_2 + task_3
        generator(arr);
        // task_4 + task_5
        insertSort(arr);
        // task_6
        System.out.println("--------------------");
        System.out.print("Введіть число для пошуку в масиві: ");
        int value = scanner.nextInt();
        // task_7
        searchToArray(value, arr);
        scanner.close();
    }
    // task_2
    public static void generator(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (random() * 100) + 1;
        }
        // task_3
        System.out.println("Початковий вигляд масиву: "
                + Arrays.toString(arr));
    }
    // task_4
    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        // task_5
        System.out.println("Відсортований масив: "
                + Arrays.toString(arr));
    }
    // task_7
    public static void searchToArray(int value, int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                System.out.println("Індекс числа " + value + " у відсортованому масиві: " + middle);
                return;
            }
            if (arr[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.out.println("Числа " + value + " немає у масиві.");
    }
}

