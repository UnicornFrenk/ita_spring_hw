package by.itacademy.spring.config;

import by.itacademy.spring.model.SaveCat;

public class CatWithXMLConfig implements SaveCat {
    @Override
    public void getMeow() {
        System.out.println("Cat with XML config");
    }
}
