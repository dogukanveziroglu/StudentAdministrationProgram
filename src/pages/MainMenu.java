package pages;

import models.User;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainMenu frame = new MainMenu();
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
    public MainMenu() {

        User user = LoginPage.currentUser;

        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 194, 164);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnStudent = new JButton("Student");

        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getRole().equals("Student") || user.getRole().equals("Admin")) {

                    StudentPanel studentpanel = new StudentPanel();
                    studentpanel.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(contentPane, "You dont have a permission!");
                }
            }
        });

        btnStudent.setBounds(38, 6, 117, 29);
        contentPane.add(btnStudent);

        JButton btnTeacher = new JButton("Teacher");

        btnTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getRole().equals("Teacher") || user.getRole().equals("Admin")) {
                    TeacherPanel teacherpanel = new TeacherPanel();
                    teacherpanel.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(contentPane, "You dont have a permission!");
                }
            }
        });

        btnTeacher.setBounds(38, 47, 117, 29);
        contentPane.add(btnTeacher);

        JButton btnAdmin = new JButton("Admin");

        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getRole().equals("Admin")) {
                    AdminPanel adminpanel = new AdminPanel();
                    adminpanel.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(contentPane, "You dont have a permission!");
                }
            }
        });

        btnAdmin.setBounds(38, 88, 117, 29);
        contentPane.add(btnAdmin);
    }

}
