package models;

public class Teacher extends User{
    public Teacher(String email, String id, String name, String surname, String password) {
        super(email, id, name, surname, password, "Teacher");
    }
}
