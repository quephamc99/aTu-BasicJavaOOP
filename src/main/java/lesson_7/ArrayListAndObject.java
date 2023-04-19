package lesson_7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person teo = new Person("teo", 29);
        personList.add(teo);
        personList.add(teo);
        System.out.println(personList);
        for (Person person : personList) {
            person.toString();
        }

        //set name, age for the second item
        personList.get(1).setName("Ti");
        System.out.println(personList);
    }
}
