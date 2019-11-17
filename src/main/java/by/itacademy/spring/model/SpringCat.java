package by.itacademy.spring.model;

import org.springframework.stereotype.Component;

@Component
public class SpringCat implements CatDao{

    @Override
    public String newCat() {
        return "complete";
    }
}
