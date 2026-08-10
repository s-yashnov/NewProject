package hw12.app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

        System.out.println("Автомобіль заведено.");
    }

    private void startElectricity() {
        System.out.println("Запускаємо електрику...");
    }

    private void startCommand() {
        System.out.println("Запускаємо систему керування...");
    }

    private void startFuelSystem() {
        System.out.println("Запускаємо паливну систему...");
    }

}
