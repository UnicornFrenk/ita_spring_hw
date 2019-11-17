package by.itacademy.spring.config;

import by.itacademy.spring.model.SaveCat;

public class CatWithJavaConfig implements SaveCat {

    @Override
    public void getMeow() {
        System.out.println("First Spring Cat!");
    }
}
