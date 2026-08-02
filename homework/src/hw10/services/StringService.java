package hw10.services;


/*
1. Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок, який складається з букв цього рядка у зворотньому порядку.
2. Напишіть метод, який приймає параметри: ціле число n і рядок text. Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
 */

public class StringService {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void printSting(String str) {
        System.out.print(str);
    }

    public static void multiString(int count, String text) {

        for (int i = 0; i < count; i++) {
            System.out.print(text + "\n");
        }
    }
}
