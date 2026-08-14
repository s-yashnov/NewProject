package hw13;

public class ShapeService {

    public static Square[] createShapesArray() {
        return new Square[] {
                new Rectangle(4, 5),
                new Circle(5),
                new Triangle(5, 5, 8)
        };
    }

    public static void printTotalSquare(Square[] shapes) {
        double totalSquare = 0;
        for (Square shape : shapes) {
            totalSquare += shape.square();
        }
        System.out.printf("Сумарна площа всіх фігур у масиві: %.2f%n", totalSquare);
    }
}
