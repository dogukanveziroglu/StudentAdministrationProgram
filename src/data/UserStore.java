package data;

import models.*;

import java.util.ArrayList;

public class UserStore {

    public static ArrayList<User> users = new ArrayList<>();

    static {

        Course course1 = new Course();
        course1.setId(101);
        course1.setName("Mathematics");
        course1.setGrade(90);

        Course course2 = new Course();
        course2.setId(102);
        course2.setName("Physics");
        course2.setGrade(85);

        Course course3 = new Course();
        course3.setId(103);
        course3.setName("Computer Science");
        course3.setGrade(95);


        Student student1 = new Student("ahmet@gmail.com", 1, "Ahmet", "Yılmaz", "1234");
        student1.studentCourses.add(course1);
        student1.studentCourses.add(course2);
        student1.setAbsence(2);


        Student student2 = new Student("elif@gmail.com", 2, "Elif", "Demir", "5678");
        student2.studentCourses.add(course2);
        student2.studentCourses.add(course3);
        student2.setAbsence(1);


        Teacher teacher1 = new Teacher("teacher@gmail.com", 10, "Mehmet", "Kaya", "teachpass");


        Admin admin1 = new Admin("admin@gmail.com", 99, "Admin", "User", "adminpass", "Admin");


        users.add(student1);
        users.add(student2);
        users.add(teacher1);
        users.add(admin1);
    }
}
