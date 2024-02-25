package ru.kashtanov.spring_hw1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.kashtanov.spring_hw1.entities.Student;
import ru.kashtanov.spring_hw1.bean_post_processor.StudentBeanPostProcessor;


import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("ru.kashtanov.spring_hw1")
public class Config {
    boolean isTaken = false;


@Bean
   public Student student1(){
       Map<String, Integer>grades = new HashMap<>();
       grades.put("MATHEMATICS",2);

       grades.put("PHYSICS",3);
       grades.put("INFORMATICS",2);
       return new Student("JIL",grades);
   }
    @Bean
    public Student student2(){
        Map<String, Integer>grades = new HashMap<>();
        grades.put("MATHEMATICS",4);
        grades.put("PHYSICS",2);
        grades.put("INFORMATICS",2);
        return new Student("JIMMY",grades);
    }

    @Bean
    public Student student3(){
        Map<String, Integer>grades = new HashMap<>();
        grades.put("MATHEMATICS",5);
        grades.put("PHYSICS",5);
        grades.put("Reading",4);
        return new Student("BILLY",grades);
    }
    @Bean
  public static StudentBeanPostProcessor studentBeanPostProcessor(){
    return new StudentBeanPostProcessor();
  }
}
