package by.itacademy.spring.config_xml;

import by.itacademy.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultPersonService {


    private PersonDao personDao;

    public DefaultPersonService() {
    }

    public Long save(Person person) {
        return personDao.save(person);
    }


}
