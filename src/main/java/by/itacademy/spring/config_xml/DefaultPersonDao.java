package by.itacademy.spring.config_xml;

import by.itacademy.spring.model.Person;

public class DefaultPersonDao implements PersonDao{

    @Override
    public Long save(Person person) {
        //dataSource.store()
        System.out.println("saved");
        return -1L;
    }

}
