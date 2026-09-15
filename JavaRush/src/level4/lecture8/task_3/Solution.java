package level4.lecture8.task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while(true){
            key = reader.readLine();

            if (key.equals(Key.USER)){
                person = new Person.User();
            } else if (key.equals(Key.LOSER)){
                person = new Person.Loser();
            } else if (key.equals(Key.CODER)) {
                person = new Person.Coder();
            } else if (key.equals(Key.PROGER)){
                person = new Person.Proger();
            } else {
                break;
            }
            doWork(person);
        }
    }

    public static void doWork(Person person){
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}
