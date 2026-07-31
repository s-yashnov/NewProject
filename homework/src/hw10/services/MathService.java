package hw10.services;


import java.util.Scanner;

public class MathService {
    private static final Scanner scanner = new Scanner(System.in);

    /*
    1. Введіть ціле число: 5
    Квадрат числа 5 дорівнює 25.
     */
    public static void toSquare (){

        System.out.print("Введіть число яке бажаєте піднести у 2 ступінь: ");

        int value = scanner.nextInt();

        System.out.println("Квадрат числа " + value + " дорівнює " + (value * value));
    }

    /*
    2. Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює 384.81334713945307.

    За радіусом і висотою: V = π ⋅ r² ⋅ h
    π (Пі) — математична константа, яка приблизно дорівнює 3.14159.
    r (або d) — радіус (відстань від центру основи до її краю) або діаметр кола.
    h — висота циліндра (відстань між паралельними основами).
     */

    public static double cylinderVolume(double rad, double height){
        double result = Math.PI * (rad * rad) * height;
        return result;
    }

    /*
    5. Введіть a: 2
    Введіть b: 3
    Результат 2^3 дорівнює 8.
     */
    public static int pow (int a, int b){
        int result = 1;
        for (int i = 0; i < a; i++) {
            result *= b;
        }
        return result;
    }

    public static void print(){
        System.out.println(pow(a, b));
    }
}
