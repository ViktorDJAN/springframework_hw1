package ru.kashtanov.spring_hw1.bean_post_processor;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.kashtanov.spring_hw1.entities.Student;


import java.util.Map;

@Component
public class StudentBeanPostProcessor implements BeanPostProcessor {
@Override
    public Object postProcessBeforeInitialization(Object bean, String name) {
        if (bean instanceof Student) {
            Student student = (Student) bean;
            if (student.getName().equals("JIL")) {
                for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
                    if (entry.getValue() < 4) {
                        entry.setValue(4);
                    }
                }return student;
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}

