import by.itacademy.spring.config.*;
import by.itacademy.spring.model.SaveCat;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SpringXmlTests {


    //раз
    @Test
    void XmlConfigurationTest() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "cat.xml");
        final CatWithXMLConfig bean = context.getBean(CatWithXMLConfig.class);
        bean.getMeow();
        context.close();
    }

    //два
    @Test
    void BeanJavaConfigurationTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                ConfigurationJava.class);
        SaveCat cat = context.getBean(CatWithJavaConfig.class);
        assertNotNull(cat);
        cat.getMeow();
        context.close();
    }

    //три
    @Test
    void BeanAnnotationTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        SaveCat cat = context.getBean(CatWithAnnotationConfig.class);
        cat.getMeow();
        assertNotNull(cat);
        context.close();
    }

    //четыре
    @Test
    void WithFieldTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        SaveCat cat = context.getBean(CatWithFieldConfiguration.class);
        cat.getMeow();
        assertNotNull(cat);
        context.close();
    }

    //пять
    @Test
    void WithSetterTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        SaveCat cat = context.getBean(CatWithSetterConfig.class);
        cat.getMeow();
        assertNotNull(cat);
        context.close();
    }


    //шесть
    @Test
    void WithConstructorTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        SaveCat cat = context.getBean(CatWithConstructorConfig.class);
        cat.getMeow();
        assertNotNull(cat);
        context.close();
    }

    //семь
    @Test
    void TwoBeansNameTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        SaveCat cat = context.getBean(TwoCatsConfig.class);
        cat.getMeow();
        assertNotNull(cat);
        context.close();
    }


    //восемь
    @Test
    void ListOfBeansTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        SaveCat cat = context.getBean(CatsListConfig.class);
        cat.getMeow();
        assertNotNull(cat);
        context.close();

    }


    //девять
    @Test
    void FromPropertiesFileTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                CatWithPropertiesConfig.class);

        SaveCat cat1 = context.getBean(SaveCat.class);
        CatWithPropertiesConfig cat = context.getBean(
                CatWithPropertiesConfig.class);
        SaveCat cat2 = context.getBean(CatWithPropertiesConfig.class);
        cat.getMeow();
        assertNotNull(cat1);
        assertNotNull(cat2);
        context.close();
    }

    //десять
    @Test
    void TimeTest() {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("by.itacademy.spring");
        context.refresh();
        ForPostProcessor postProcessor = context.getBean(
                ForPostProcessor.class);
        postProcessor.time();
        postProcessor.time2();
        postProcessor.notime();
        context.close();
    }
}

