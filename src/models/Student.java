package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends User{

    public ArrayList<Course> studentCourses = new ArrayList<>();
    int absence;

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public Student() {

    }

    public Student(String email, int id, String name, String surname, String password) {
        super(email, id, name, surname, password,"Student");
    }


}
