package by.itacademy.spring.config;

import by.itacademy.spring.model.SaveCat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("cat.properties")
public class CatWithPropertiesConfig implements SaveCat {

    @Value("${cat}")
    String cat;

    @Override
    public void getMeow() {
        System.out.println("My cat name is " + cat);

    }
}
