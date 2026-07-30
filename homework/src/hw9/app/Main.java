package hw9.app;


/*
Створіть Java програму, яка виконує наступні завдання, використовуючи двовимірний масив (матрицю):

Створіть двовимірний масив цілих чисел розмірністю 4x4.
Заповніть матрицю випадковими цілими числами в діапазоні від 1 до 50.
Виведіть матрицю на екран у вигляді таблиці.
Знайдіть суму всіх елементів в парних рядках (рядок 0, 2) та суму всіх елементів в непарних рядках (рядок 1, 3).
Знайдіть добуток всіх елементів в парних стовпцях (стовпцях 0, 2) та добуток всіх елементів в непарних стовпцях (стовпцях 1, 3).
Виведіть результати сум та добутків для парних і непарних рядків та стовпців.
Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця, в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.
 */

import java.util.Random;

public class Main {

    private static final int[][] ARR = new int[4][4];
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        createArray(ARR);
        printArray(ARR);
        sumPairRow(ARR);
        sumNoPairRow(ARR);
        multiplyPairRow(ARR);
        multiplyNoPairRow(ARR);
        printMagicMatrixResult(ARR);
    }

    public static void createArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = RANDOM.nextInt(1, 50);
            }
        }
    }



    public static void sumPairRow(int[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                        sum += arr[i][j];
                    }
                }
            }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sum);
    }

    public static void sumNoPairRow(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < arr[i].length; j++) {
                        sum += arr[i][j];
                    }
                }
            }
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sum);
    }

    public static void multiplyPairRow(int[][] arr) {
        long multiply = 1;
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    multiply *= arr[i][j];
                }
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (0, 2): " + multiply);
    }

    public static void multiplyNoPairRow(int[][] arr){
        long multiply = 1;
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 != 0) {
                for (int i = 0; i < arr.length; i++) {
                    multiply *= arr[i][j];
                }
            }
        }
        System.out.println("Добуток елементів у непарних стовпцях (1, 3): " + multiply);
    }
    //Перевірте, чи матриця є магічним квадратом. Магічний квадрат - це квадратна матриця, в якій суми всіх рядків, стовпців та діагоналей рівні між собою.
    public static boolean checkMagicMatrix(int[][] arr) {

        int targetSum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            targetSum += arr[0][j];
        }
        for (int[] row : arr) {
            int rowSum = 0;
            for (int value : row) {
                rowSum += value;
            }
            if (rowSum != targetSum) {
                return false;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            int columnSum = 0;
            for (int[] column : arr) {
                columnSum += column[j];
            }
            if (columnSum != targetSum) {
                return false;
            }
        }
        int mainDiagonalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            mainDiagonalSum += arr[i][i];
        }

        if (mainDiagonalSum != targetSum) {
            return false;
        }
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            secondaryDiagonalSum += arr[i][arr.length - 1 - i];
        }
        return secondaryDiagonalSum == targetSum;
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMagicMatrixResult(int[][] arr) {

        if (checkMagicMatrix(arr)) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}

