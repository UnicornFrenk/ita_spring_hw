package by.itacademy.spring.config;

import by.itacademy.spring.model.MyAnnotation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CatWithBeanPostProcessor implements BeanPostProcessor {
    Map<String, List<Method>> methodsByBeanName = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Method method : bean.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                List<Method> methods = methodsByBeanName.get(beanName);
                if (methods == null) {
                    ArrayList<Method> value = new ArrayList<>();
                    value.add(method);
                    methodsByBeanName.put(beanName, value);

                } else {
                    methods.add(method);
                }
            }
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        List<Method> methods = methodsByBeanName.get(beanName);
        if (methods != null) {
            ProxyFactory proxyFactory = new ProxyFactory();
            proxyFactory.setTarget(bean);
            proxyFactory.addAdvice(new MI());
            return proxyFactory.getProxy();
        }


        return bean;
    }

    class MI implements MethodInterceptor {
        @Override
        public Object invoke(MethodInvocation methodInvocation) throws Throwable {

            Object result = methodInvocation.proceed();

            return result;
        }
    }

}
