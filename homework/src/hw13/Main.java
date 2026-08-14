package hw13;

/*

1. Створити порожній проект в IntelliJ
2. Створити базовий інтерфейс для геометричної фігури, в якому є метод, який повертає площу фігури.
3. Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат.
4. Створити масив фігур, і написати метод який виведе сумарну площу всіх фігур у цьому масиві
5. Залийте виконаний проект на свій GitHub репозиторій, посилання на який зазначте в LMS.

 */

public class Main {

    public static void main(String[] args) {

        Square[] shapes = {
                new Rectangle(4, 5),
                new Circle(5),
                new Triangle(5, 5, 8)
        };
        printTotalSquare(shapes);
    }

    public static void printTotalSquare(Square[] shapes) {
        double totalSquare = 0;
        for (Square shape : shapes) {
            totalSquare += shape.square();
        }
        System.out.printf("Сумарна площа всіх фігур у масиві: %.2f%n", totalSquare);
    }

}
