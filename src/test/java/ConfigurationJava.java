import by.itacademy.spring.config.CatWithJavaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationJava {
    @Bean
    CatWithJavaConfig configurationJ(){
        return new CatWithJavaConfig();
    }
}

