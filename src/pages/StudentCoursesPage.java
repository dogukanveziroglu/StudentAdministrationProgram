package pages;

import data.UserStore;
import models.Course;
import models.Student;
import models.User;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentCoursesPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    DefaultListModel<String> studentModel;
    DefaultListModel<String> courseModel;

    public void filltheUserList() {
        studentModel.removeAllElements();
        for (User user : UserStore.users) {
            if (user.getRole().equals("Student")) {
                studentModel.addElement(user.getId() + " " + user.getName() + " " + user.getSurname());
            }
        }
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentCoursesPage frame = new StudentCoursesPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public StudentCoursesPage() {

        setTitle("Student Courses Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JComboBox cbCourse = new JComboBox();
        cbCourse.setBounds(323, 40, 127, 27);
        contentPane.add(cbCourse);

        studentModel = new DefaultListModel();
        JList listStudent = new JList(studentModel);
        filltheUserList();

        listStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                int id = Integer.parseInt(listStudent.getSelectedValue().toString().split(" ")[0]);
                courseModel.removeAllElements();

                for (User user : UserStore.users) {
                    if (user.getId() == id){

                        Student stu = (Student) user;

                        for (Course course: stu.studentCourses){
                            courseModel.addElement(course.getId() + " " + course.getName());
                        }

                        for (Course c : CourseManagementPage.courses) {

                            boolean alreadyEnrolled = stu.studentCourses.stream()
                                    .anyMatch(enrolled -> enrolled.getId() == c.getId());

                            if (!alreadyEnrolled) {
                                cbCourse.addItem(c);
                            }
                        }


                    }
                }

            }
        });

        courseModel = new DefaultListModel<>();
        JList listCourse = new JList(courseModel);

        listCourse.setBounds(171, 44, 140, 222);
        contentPane.add(listCourse);

        listStudent.setBounds(6, 44, 159, 222);
        contentPane.add(listStudent);

        JButton btnAdd = new JButton("Add Course");

        btnAdd.setBounds(327, 79, 117, 29);
        contentPane.add(btnAdd);

        JButton btnDelete = new JButton("Delete Course");

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(listStudent.getSelectedValue().toString().split(" ")[0]);

                for (User user : UserStore.users) {
                    if (user.getId() == id){

                        Student stu = (Student) user;

                        int courseid = Integer.parseInt(listCourse.getSelectedValue().toString().split(" ")[0]);

                        stu.studentCourses.removeIf(course -> course.getId() == courseid);

                        courseModel.removeAllElements();

                        for (Course course: stu.studentCourses){
                            courseModel.addElement(course.getId() + " " + course.getName());
                        }

                    }
                }

            }
        });

        btnDelete.setBounds(327, 120, 117, 29);
        contentPane.add(btnDelete);

        JLabel lblStudentList = new JLabel("Student List");
        lblStudentList.setBounds(6, 16, 108, 16);
        contentPane.add(lblStudentList);

        JLabel lblCourseList = new JLabel("Course List");
        lblCourseList.setBounds(177, 16, 93, 16);
        contentPane.add(lblCourseList);

        JButton btnMainMenu = new JButton("Main Menu");

        btnMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();

            }
        });

        btnMainMenu.setBounds(327, 156, 117, 29);
        contentPane.add(btnMainMenu);

        filltheUserList();
    }
}
