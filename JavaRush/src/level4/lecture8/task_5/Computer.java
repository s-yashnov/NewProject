package level4.lecture8.task_5;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
