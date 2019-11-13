package by.itacademy.spring.config_xml;

import by.itacademy.spring.model.Person;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class Configxml {

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "factory-method.xml");
        context.refresh();

        final DefaultPersonService bean = context.getBean(
                DefaultPersonService.class);
        bean.save(new Person());
    }
}