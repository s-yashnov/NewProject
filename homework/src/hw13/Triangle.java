package hw13;

public class Triangle implements Square{

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Сторони трикутника повинні бути більшими за нуль!");
        }
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Трикутник із такими сторонами не існує! (Сума двох сторін має бути більшою за третю)");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double square() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        if (Double.isNaN(area) || Double.isInfinite(area)) {
            return 0;
        }

        return area;
    }
    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}

