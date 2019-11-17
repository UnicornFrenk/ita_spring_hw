package by.itacademy.spring.config;

import by.itacademy.spring.model.SpringCat;
import by.itacademy.spring.model.SaveCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CatWithConstructorConfig implements SaveCat {

    SpringCat cat;

    public CatWithConstructorConfig() {
    }

    @Autowired
    public CatWithConstructorConfig(SpringCat cat) {
        this.cat = cat;
    }


    @Override
    public void getMeow() {
        System.out.println("Spring cat with constructor " + cat.newCat());
    }

}
