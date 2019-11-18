package by.itacademy.spring.config;

import by.itacademy.spring.model.SaveCat;
import org.springframework.stereotype.Component;

@Component
public class CatWithAnnotationConfig implements SaveCat {


    @Override
    public void getMeow() {
        System.out.println("Spring Cat with Annotation!" );
    }

}
