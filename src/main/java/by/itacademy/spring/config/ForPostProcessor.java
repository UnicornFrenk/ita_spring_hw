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
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void notime(){
        System.out.println("вообще без bla-bla");

}
}
