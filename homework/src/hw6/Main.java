package hw6;

import java.util.Scanner;

public class Main {

    /*
    Є діапазон чисел від 1 до 6, включно.
    За допомогою циклу розрахуйте суму чисел наростаючим підсумком та загальну суму чисел.
    Виведення окремого пункту переліку чисел має бути пронумероване. Виведення має такий вигляд:

    1) Num is 1, sum is 1
    2) Num is 2, sum is 3
    3) Num is 3, sum is 6
    4) Num is 4, sum is 10
    5) Num is 5, sum is 15
    6) Num is 6, sum is 21
    ------------------------
    Sum of numbers is 21

     */

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int num = readNumber();
        printSum(num);
    }

    private static int readNumber(){
        int number;

        while(true){
            System.out.print("Enter positive number: ");

            if(!SCANNER.hasNextInt()) {
                System.out.println("Input is not a number.");
                SCANNER.next();
                continue;
            }
            number = SCANNER.nextInt();

            if (number > 0) {
                return number;
            }
            System.out.println("The number must be positive.");
        }
    }

    private static void printSum(int number){
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            System.out.println(i + ") Num is " + i + ", sum is " + (sum += i));
        }
        System.out.println("--------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
