package models;

public class Admin extends User{

    public Admin(String email, int id, String name, String surname, String password, String role) {
        super(email, id, name, surname, password, "Admin");
    }

    public Admin() {
    }
}
