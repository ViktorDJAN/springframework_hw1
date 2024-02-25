package ru.kashtanov.spring_hw1.entities;

import javax.annotation.PostConstruct;
import java.util.Map;


public class Student {
    private String name;
    private Map<String,Integer> grades;
    private boolean isTaken = false;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, Map<String, Integer> grades) {
        this.name = name;
        this.grades = grades;

    }

  @PostConstruct
  public void init(){
        double averageGrade= grades.values().stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        setTaken(averageGrade>=3.0);
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", isTaken=" + isTaken +
                '}';
    }

}
