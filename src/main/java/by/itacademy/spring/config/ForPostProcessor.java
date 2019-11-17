package by.itacademy.spring.config;

import by.itacademy.spring.model.MyAnnotation;
import org.springframework.stereotype.Component;

@Component
public class ForPostProcessor {

    public ForPostProcessor(){}

    @MyAnnotation
    public void time(){
        System.out.println("bla-bla");
        System.out.println("bla-bla");
        System.out.println("bla-bla");
        System.out.println("bla-bla");
        System.out.println("bla-bla");
    }
}
