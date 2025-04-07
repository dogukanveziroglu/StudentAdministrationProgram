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

public class StudentGradesPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    DefaultListModel<String> modelStudent = new DefaultListModel<>();
    DefaultListModel<String> modelCourse = new DefaultListModel<>();

    public void filltheStudentList() {
        modelStudent.removeAllElements();

        for (User u : UserStore.users) {
            if (u.getRole().equals("Student")) {
                modelStudent.addElement(u.getId() + " " + u.getName() + " " + u.getSurname());
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
                    StudentGradesPage frame = new StudentGradesPage();
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
    public StudentGradesPage() {

        filltheStudentList();

        setTitle("Student Grades Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 332);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JList listCourse = new JList(modelCourse);
        listCourse.setBounds(171, 68, 140, 222);
        contentPane.add(listCourse);

        JList listStudent = new JList(modelStudent);

        listStudent.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int id = Integer.parseInt(listStudent.getSelectedValue().toString().split(" ")[0]);

                for (User user : UserStore.users) {
                    if (user.getId() == id) {

                        Student stu = (Student) user;

                        for (Course c : stu.studentCourses) {
                            modelCourse.addElement(c.getId() + " " + c.getName());
                        }

                    }

                }
            }
        });

        listStudent.setBounds(6, 68, 159, 222);
        contentPane.add(listStudent);

        JLabel lblCourseList = new JLabel("Course List");
        lblCourseList.setBounds(177, 40, 93, 16);
        contentPane.add(lblCourseList);

        JLabel lblStudentList = new JLabel("Student List");
        lblStudentList.setBounds(6, 40, 108, 16);
        contentPane.add(lblStudentList);

        JComboBox cbGrade = new JComboBox();
        cbGrade.setBounds(323, 64, 71, 27);
        contentPane.add(cbGrade);

        for (int i = 0; i < 101; i++) {
            cbGrade.addItem(i);
        }

        JButton btnSave = new JButton("Save");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (listStudent.getSelectedValue() == null || listCourse.getSelectedValue() == null) {
                    JOptionPane.showMessageDialog(null, "Please select a student and a course.");
                    return;
                }

                int studentId = Integer.parseInt(listStudent.getSelectedValue().toString().split(" ")[0]);

                int courseId = Integer.parseInt(listCourse.getSelectedValue().toString().split(" ")[0]);

                int grade = Integer.parseInt(cbGrade.getSelectedItem().toString());

                for (User user : UserStore.users) {
                    if (user.getId() == studentId) {
                        Student student = (Student) user;

                        for (Course c : student.studentCourses) {
                            if (c.getId() == courseId) {
                                c.setGrade(grade);
                                JOptionPane.showMessageDialog(contentPane, "Grade saved successfully!");
                                return;
                            }
                        }
                    }
                }
            }
        });

        btnSave.setBounds(323, 103, 71, 29);
        contentPane.add(btnSave);

        JLabel lblGrades = new JLabel("Grades");
        lblGrades.setBounds(323, 40, 61, 16);
        contentPane.add(lblGrades);

        JButton btnMainMenu = new JButton("Main Menu");

        btnMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        btnMainMenu.setBounds(309, 143, 111, 29);
        contentPane.add(btnMainMenu);
    }

}
