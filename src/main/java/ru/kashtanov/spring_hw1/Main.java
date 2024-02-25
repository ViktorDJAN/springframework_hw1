package ru.kashtanov.spring_hw1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.kashtanov.spring_hw1.config.Config;
import ru.kashtanov.spring_hw1.entities.Tutor;

public class Main {
    public static void main(String[] args) {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(Config.class);

        Tutor xmlTeacher = xmlContext.getBean("tutor", Tutor.class);
        Tutor javaTeacher = javaContext.getBean("tutor", Tutor.class);
        System.out.println(javaTeacher);
        System.out.println(xmlTeacher);



    }
}
