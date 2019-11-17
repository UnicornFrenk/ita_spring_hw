package by.itacademy.spring.config;

import by.itacademy.spring.model.MyAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class CatWithBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ForPostProcessor) {
            Class<?> beanClass = bean.getClass();

            Method method = null;
            try {
                method = beanClass.getMethod("time");
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            if (method.isAnnotationPresent(MyAnnotation.class)) {
                System.out.printf("BeanPostProcessor count: ");
            }

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {


        Class beanClass = beanName.getClass();
        long startTime = System.currentTimeMillis();
        //System.nanoTime();

        try {

            Method method = beanClass.getMethod("time");
            System.out.println(method.toString() + " start");
            method.invoke(bean);
        } catch (Exception e) {
            e.printStackTrace();

            long stopTime = System.currentTimeMillis();
            //System.nanoTime();

            long methodTime = stopTime - startTime;
            System.out.println("Time is " + methodTime);
        }
        return bean;
    }
}
