package by.itacademy.spring.config;

import by.itacademy.spring.model.SaveCat;
import by.itacademy.spring.model.SpringCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatWithFieldConfiguration implements SaveCat {

    @Autowired
    SpringCat cat;


    @Override
    public void getMeow() {
        System.out.println("Cat's configuration with field " + cat.newCat());
    }
}

