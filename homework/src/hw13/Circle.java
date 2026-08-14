package hw13;

public class Circle implements Square{

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус кола повинен бути більшим за нуль!");
        }
        if (Double.isNaN(radius) || Double.isInfinite(radius)) {
            throw new IllegalArgumentException("Передано некоректне числове значення для радіуса!");
        }

        this.radius = radius;
    }

    @Override
    public double square() {
        double area = Math.PI * Math.pow(radius, 2);
        if (Double.isInfinite(area)) {
            System.out.println("Помилка: площа кола занадто велика для обчислення!");
            return 0;
        }
        return area;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
