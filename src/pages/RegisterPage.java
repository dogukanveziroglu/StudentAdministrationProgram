package pages;

import data.UserStore;
import models.Admin;
import models.Student;
import models.Teacher;
import models.User;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtEmail;
    private JTextField txtPassword;
    private JTextField txtSurname;
    private JTextField txtName;
    private JTextField txtId;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegisterPage frame = new RegisterPage();
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
    public RegisterPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 390, 225);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Role");
        lblNewLabel.setBounds(47, 21, 61, 16);
        contentPane.add(lblNewLabel);

        JRadioButton rdbtnAdmin = new JRadioButton("Admin");
        rdbtnAdmin.setBounds(30, 50, 92, 23);
        contentPane.add(rdbtnAdmin);

        JRadioButton rdbtnTeacher = new JRadioButton("Teacher");
        rdbtnTeacher.setBounds(30, 85, 92, 23);
        contentPane.add(rdbtnTeacher);

        JRadioButton rdbtnStudent = new JRadioButton("Student");
        rdbtnStudent.setBounds(30, 120, 92, 23);
        contentPane.add(rdbtnStudent);

        ButtonGroup btnrole = new ButtonGroup();
        btnrole.add(rdbtnStudent);
        btnrole.add(rdbtnAdmin);
        btnrole.add(rdbtnTeacher);

        JLabel lblNewLabel_1 = new JLabel("Email");
        lblNewLabel_1.setBounds(134, 96, 72, 16);
        contentPane.add(lblNewLabel_1);

        txtEmail = new JTextField();
        txtEmail.setBounds(207, 91, 130, 26);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Password");
        lblNewLabel_1_1.setBounds(134, 122, 61, 16);
        contentPane.add(lblNewLabel_1_1);

        txtPassword = new JTextField();
        txtPassword.setColumns(10);
        txtPassword.setBounds(207, 117, 130, 26);
        contentPane.add(txtPassword);

        txtSurname = new JTextField();
        txtSurname.setColumns(10);
        txtSurname.setBounds(207, 66, 130, 26);
        contentPane.add(txtSurname);

        JLabel lblNewLabel_1_1_1 = new JLabel("Surname");
        lblNewLabel_1_1_1.setBounds(134, 71, 61, 16);
        contentPane.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Name");
        lblNewLabel_1_2.setBounds(134, 46, 72, 16);
        contentPane.add(lblNewLabel_1_2);

        txtName = new JTextField();
        txtName.setColumns(10);
        txtName.setBounds(207, 41, 130, 26);
        contentPane.add(txtName);

        txtId = new JTextField();
        txtId.setColumns(10);
        txtId.setBounds(207, 11, 130, 26);
        contentPane.add(txtId);

        JLabel lblNewLabel_1_2_1 = new JLabel("ID");
        lblNewLabel_1_2_1.setBounds(134, 16, 72, 16);
        contentPane.add(lblNewLabel_1_2_1);

        JButton btnSave = new JButton("Save");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnrole.equals(rdbtnStudent)) {
                    User stu = new Student();
                    stu.setId(Integer.parseInt(txtId.getText()));
                    stu.setName(txtName.getText());
                    stu.setSurname(txtSurname.getText());
                    stu.setEmail(txtEmail.getText());
                    stu.setPassword(txtPassword.getText());

                    UserStore.users.add(stu);

                } else if (btnrole.equals(rdbtnTeacher)) {
                    User tch = new Teacher();

                    tch.setId(Integer.parseInt(txtId.getText()));
                    tch.setName(txtName.getText());
                    tch.setSurname(txtSurname.getText());
                    tch.setEmail(txtEmail.getText());
                    tch.setPassword(txtPassword.getText());

                    UserStore.users.add(tch);

                } else if (btnrole.equals(rdbtnAdmin)){
                    User adm = new Admin();

                    adm.setId(Integer.parseInt(txtId.getText()));
                    adm.setName(txtName.getText());
                    adm.setSurname(txtSurname.getText());
                    adm.setEmail(txtEmail.getText());
                    adm.setPassword(txtPassword.getText());

                    UserStore.users.add(adm);

                }
            }
        });

        btnSave.setBounds(207, 139, 117, 29);
        contentPane.add(btnSave);

        JButton btnMainMenu = new JButton("Main Menu");

        btnMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        btnMainMenu.setBounds(207, 162, 117, 29);
        contentPane.add(btnMainMenu);
    }
}
