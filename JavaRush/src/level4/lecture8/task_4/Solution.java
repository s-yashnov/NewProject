package level4.lecture8.task_4;

public class Solution {

    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object obj) {
        if (obj instanceof Drawable) {
            ((Drawable) obj).draw();
        } else if (obj instanceof Movable) {
            ((Movable) obj).move();
        }
    }

    interface Movable {
        void move();
    }

    static class Circle implements Movable {
        public void draw () {
            System.out.println("Can be drawn");
        }

        public void move () {
            System.out.println("Can be moved");
        }
    }

    interface Drawable {
        void draw ();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("Can be drawn");
        }
        public void move() {
            System.out.println("Can be moved");
        }
    }
}
