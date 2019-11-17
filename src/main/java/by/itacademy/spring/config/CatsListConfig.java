package by.itacademy.spring.config;

import by.itacademy.spring.model.CatDao;
import by.itacademy.spring.model.SaveCat;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CatsListConfig implements SaveCat {

    List<CatDao> catsList;

    public CatsListConfig(List<CatDao> catsList) {

        this.catsList = catsList;
    }

    @Override
    public void getMeow() {
        System.out.println("Cats:");
        catsList.forEach(cats -> System.out.println(cats.newCat()));

    }

}
