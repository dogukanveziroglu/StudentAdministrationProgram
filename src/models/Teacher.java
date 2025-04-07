package models;

public class Teacher extends User{
    public Teacher(String email, int id, String name, String surname, String password) {
        super(email, id, name, surname, password, "Teacher");
    }

    public Teacher() {
    }
}
