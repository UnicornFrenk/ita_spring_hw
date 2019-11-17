package by.itacademy.spring.config;

import by.itacademy.spring.model.MyAnnotation;
import org.springframework.stereotype.Component;

@Component
public class ForPostProcessor {

    public ForPostProcessor(){}

    @MyAnnotation
    public void time(){
        System.out.println("bla-bla-1");
    }

    @MyAnnotation
    public void time2(){
        System.out.println("bla-bla-2");
    }

    public void notime(){
        System.out.println("no-bla-bla");
    }
}
