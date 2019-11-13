package by.itacademy.spring.model;

public class Person {
    private static Person person = new Person();

    public static Person getInstance() {
        return person;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
    }

    public void personPerform(){
        System.out.println("Hi," + name);
    }
}
