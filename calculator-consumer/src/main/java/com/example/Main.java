package com.example;

import com.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double a = 10;
        double b = 4;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Додавання: a + b = " + calculator.add(a, b));
        System.out.println("Віднімання: a - b = " + calculator.subtract(a, b));
        System.out.println("Множення: a * b = " + calculator.multiply(a, b));
        System.out.println("Ділення: a / b = " + calculator.divide(a, b));

        try {
            calculator.divide(a, 0);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}