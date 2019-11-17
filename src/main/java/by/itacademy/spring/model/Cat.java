package by.itacademy.spring.model;

import org.springframework.stereotype.Component;

public class Cat implements CatDao {
    private String catName;

    private static Cat cat = new Cat();

    public Cat() {
    }

    public Cat(String catName) {
        this.catName = catName;
    }

    public static Cat getInstance() {
        return cat;
    }

    public String getName() {
        return catName;
    }

    public void setName(String catName) {
        this.catName = catName;
    }

    public void showCat() {
        System.out.println("Hello:" + catName);
    }
    @Override
    public String newCat() {
        System.out.println("Hello, new Cat:" + catName);
        return catName;
    }

}
