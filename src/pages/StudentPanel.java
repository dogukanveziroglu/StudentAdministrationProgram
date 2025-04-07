package pages;

import data.UserStore;
import models.Course;
import models.Student;
import models.User;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class StudentPanel extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    DefaultListModel model = new DefaultListModel<>();

    /**
     * Launch the application.
     */

    public void filltheList() {
        for (User u : UserStore.users) {
            if (u.getRole().equals("Student")) {
                Student stu = (Student) u;

                for (Course c : stu.studentCourses) {
                    model.addElement(c.getId() + " " + c.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentPanel frame = new StudentPanel();
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
    public StudentPanel() {

        filltheList();

        setTitle("Student Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 266, 347);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnLogout = new JButton("Logout");

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
                dispose();
            }
        });

        btnLogout.setBounds(155, 177, 80, 29);
        contentPane.add(btnLogout);

        JLabel lblStudentPanel = new JLabel("Student Panel");
        lblStudentPanel.setBounds(16, 6, 91, 16);
        contentPane.add(lblStudentPanel);

        JButton btnMainMenu = new JButton("Main Menu");

        btnMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        btnMainMenu.setBounds(155, 210, 98, 29);
        contentPane.add(btnMainMenu);

        JLabel lblName = new JLabel("");

        lblName.setText(LoginPage.currentUser.getName() + " " + LoginPage.currentUser.getSurname());

        lblName.setBounds(16, 34, 117, 16);
        contentPane.add(lblName);

        JTextArea txtGrade = new JTextArea();
        txtGrade.setBounds(155, 83, 41, 25);
        contentPane.add(txtGrade);

        JTextArea txtAbsence = new JTextArea();
        txtAbsence.setBounds(155, 140, 41, 25);
        contentPane.add(txtAbsence);

        JLabel lblLessons = new JLabel("Lessons");
        lblLessons.setBounds(16, 55, 71, 16);
        contentPane.add(lblLessons);

        JList listLessons = new JList(model);

        listLessons.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Student stu = (Student) LoginPage.currentUser;

                String selectedValue = listLessons.getSelectedValue().toString();
                int selectedCourseId = Integer.parseInt(selectedValue.split(" ")[0]);

                for (Course c : stu.studentCourses) {
                    if (c.getId() == selectedCourseId) {
                        txtGrade.setText(String.valueOf(c.getGrade()));
                        break;
                    }
                }
                txtAbsence.setText(String.valueOf(stu.getAbsence()));
            }
        });


        listLessons.setBounds(16, 83, 127, 156);
        contentPane.add(listLessons);

        JLabel lblGrade = new JLabel("Grade");
        lblGrade.setBounds(155, 61, 61, 16);
        contentPane.add(lblGrade);

        JLabel lblAbsence = new JLabel("Absence");
        lblAbsence.setBounds(155, 120, 61, 16);
        contentPane.add(lblAbsence);
    }
}
