package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUsername;
    private JTextField txtPassword;

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
        setBounds(100, 100, 377, 205);
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

        JLabel lblNewLabel_1 = new JLabel("Username");
        lblNewLabel_1.setBounds(134, 54, 72, 16);
        contentPane.add(lblNewLabel_1);

        txtUsername = new JTextField();
        txtUsername.setBounds(207, 49, 130, 26);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Password");
        lblNewLabel_1_1.setBounds(134, 90, 61, 16);
        contentPane.add(lblNewLabel_1_1);

        txtPassword = new JTextField();
        txtPassword.setColumns(10);
        txtPassword.setBounds(207, 85, 130, 26);
        contentPane.add(txtPassword);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(207, 119, 117, 29);
        contentPane.add(btnSave);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnMainMenu.setBounds(207, 142, 117, 29);
        contentPane.add(btnMainMenu);
    }
}
