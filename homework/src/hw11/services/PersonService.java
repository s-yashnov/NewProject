package hw11.services;


import hw11.models.Person;

public class PersonService {
    public static void printPerson(Person person) {
        System.out.println(
                "Ім'я: " + person.getName() +
                ", Вік: " + person.getAge() +
                ", Професія: " + person.getProfession()
        );
    }
}
