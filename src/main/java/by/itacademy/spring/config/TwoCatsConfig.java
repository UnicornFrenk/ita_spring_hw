package by.itacademy.spring.config;


import by.itacademy.spring.model.CatDao;
import by.itacademy.spring.model.SaveCat;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TwoCatsConfig implements SaveCat{
    @Qualifier("cat1")
    CatDao cat1;
    @Qualifier("cat2")
    CatDao cat2;

    public TwoCatsConfig(CatDao cat1, CatDao cat2) {
        this.cat1 = cat1;
        this.cat2 = cat2;
    }


    @Override
    public void getMeow() {
        System.out.println("First cat name is " + cat1.newCat()+ ", second" +
                                   " cat name is " + cat2.newCat() + " =) " );
    }
}
