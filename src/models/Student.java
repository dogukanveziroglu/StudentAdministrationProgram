package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends User{

    ArrayList<Course> courses;
    Map<Course, Integer> grades;
    Map<Course, Integer> absence;

    public Student() {
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
        this.absence = new HashMap<>();
    }

    public Student(String id, String name, String surname, String email, String password) {
        super(id, name, surname, email, password,"Student");
        this.courses = new ArrayList<>();
        this.grades = new HashMap<>();
        this.absence = new HashMap<>();
    }


}
