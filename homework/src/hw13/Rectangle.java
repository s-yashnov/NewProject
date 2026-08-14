package hw13;

import java.util.Scanner;

public class Rectangle implements Square{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Сторони прямокутника повинні бути більшими за нуль!");
        }
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isInfinite(a) || Double.isInfinite(b)) {
            throw new IllegalArgumentException("Передані некоректні числові значення для сторін!");
        }
        this.a = a;
        this.b = b;
    }
    @Override
    public double square() {
        double area = a * b;
        if (Double.isInfinite(area)) {
            System.out.println("Помилка: площа занадто велика для обчислення!");
            return 0;
        }
        return area;
    }
}
