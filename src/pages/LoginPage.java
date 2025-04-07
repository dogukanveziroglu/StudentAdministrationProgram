package pages;

import models.Admin;
import models.User;
import data.UserStore;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginPage extends JFrame {
    public static User currentUser;
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtEmail;
    private JPasswordField passwordField;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    User admin = new Admin();
                    admin.setId(1);
                    admin.setName("admin");
                    admin.setSurname("");
                    admin.setEmail("admin@example.com");
                    admin.setPassword("admin123");
                    UserStore.users.add(admin);




                    LoginPage frame = new LoginPage();
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
    public LoginPage() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 249, 196);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("E-mail");
        lblNewLabel.setBounds(23, 25, 72, 16);
        contentPane.add(lblNewLabel);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(23, 53, 61, 16);
        contentPane.add(lblPassword);

        txtEmail = new JTextField();
        txtEmail.setBounds(96, 20, 130, 26);
        contentPane.add(txtEmail);
        txtEmail.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(96, 48, 130, 26);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = txtEmail.getText();
                String password = new String(passwordField.getPassword());


                boolean checkUser = false;
                for (User user : UserStore.users) {
                    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        currentUser = user;
                        checkUser = true;
                        break;
                    }
                }

                if(checkUser){
                    MainMenu menu = new MainMenu();
                    menu.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(contentPane,"Login Successful!");
                }
                else{
                    JOptionPane.showMessageDialog(contentPane,"Login Failed!");
                    txtEmail.setText("");
                    passwordField.setText("");
                }


            }
        });

        btnLogin.setBounds(96, 86, 117, 29);
        contentPane.add(btnLogin);
    }
}
