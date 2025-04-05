package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUsername;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
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

        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setBounds(23, 25, 72, 16);
        contentPane.add(lblNewLabel);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(23, 53, 61, 16);
        contentPane.add(lblPassword);

        txtUsername = new JTextField();
        txtUsername.setBounds(96, 20, 130, 26);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(96, 48, 130, 26);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(96, 86, 117, 29);
        contentPane.add(btnLogin);
    }
}
