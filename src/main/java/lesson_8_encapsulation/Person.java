package lesson_8_encapsulation;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(age<0){
            throw new IllegalArgumentException("Age can not be negative");
        }
        this.name = name;
        this.age = age;
    }
}
