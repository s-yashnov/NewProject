package hw11.app;

import hw11.models.Person;
import hw11.services.PersonService;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        System.out.println("Початкова інформація:");
        PersonService.printPerson(person1);
        PersonService.printPerson(person2);
        PersonService.printPerson(person3);

        System.out.println();
        System.out.println("Після зміни професії:");

        person2.setProfession("Дизайнер");

        PersonService.printPerson(person2);
    }

}
