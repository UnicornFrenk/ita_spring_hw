import by.itacademy.spring.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlTests {

    @Test
    void factoryMethodTestXml() {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "factory-method.xml");
        final Person bean = context.getBean(Person.class);
        bean.personPerform();
    }

}
