package pages;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AdminPanel extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminPanel frame = new AdminPanel();
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
    public AdminPanel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 284, 182);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnRegister = new JButton("Register Panel");

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterPage registerPage = new RegisterPage();
                registerPage.setVisible(true);
                dispose();
            }
        });

        btnRegister.setBounds(6, 41, 117, 29);
        contentPane.add(btnRegister);

        JButton btnDeleteUser = new JButton("Delete User Panel");

        btnDeleteUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteUserPanel deleteUserPanel = new DeleteUserPanel();
                deleteUserPanel.setVisible(true);
                dispose();
            }
        });

        btnDeleteUser.setBounds(135, 41, 137, 29);
        contentPane.add(btnDeleteUser);

        JButton btnLogout = new JButton("Logout");

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage loginPage = new LoginPage();
                loginPage.setVisible(true);
                dispose();
            }
        });

        btnLogout.setBounds(6, 83, 117, 29);
        contentPane.add(btnLogout);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        btnBack.setBounds(70, 119, 137, 29);
        contentPane.add(btnBack);

        JLabel lblNewLabel = new JLabel("Admin Panel");
        lblNewLabel.setBounds(89, 13, 78, 16);
        contentPane.add(lblNewLabel);

        JButton btnAddCourse = new JButton("Add Course");

        btnAddCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CourseManagementPage courseManagementPage = new CourseManagementPage();
                courseManagementPage.setVisible(true);
                dispose();
            }
        });

        btnAddCourse.setBounds(135, 83, 137, 29);
        contentPane.add(btnAddCourse);
    }
}
