package hw12.app;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee(
                "Станіслав Яшнов",
                "Java Developer",
                "stanislav@gmail.com",
                "0991234567",
                32
        );

        employee.printInfo();
        System.out.println("--------------------");

        Car car = new Car();
        car.start();
    }

}
