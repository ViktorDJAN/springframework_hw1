package ru.kashtanov.spring_hw1.entities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
@ComponentScan("ru.kashtanov.spring_hw1")
public class Tutor {

    private String name = "NICOLA";

    private List<Student> students;
    @Autowired
    public Tutor(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
