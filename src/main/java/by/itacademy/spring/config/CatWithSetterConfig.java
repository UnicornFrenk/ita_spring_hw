package by.itacademy.spring.config;

import by.itacademy.spring.model.SaveCat;
import by.itacademy.spring.model.SpringCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CatWithSetterConfig implements SaveCat {


    SpringCat cat;

    @Autowired
    public void setCatName(SpringCat cat) {
        this.cat = cat;
    }


    @Override
    public void getMeow() {
        System.out.println("Spring cat configuration with setter " + cat.newCat() );
    }
}

