package pages;

import java.awt.EventQueue;

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
        setBounds(100, 100, 282, 146);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnRegister = new JButton("Register Panel");
        btnRegister.setBounds(6, 41, 117, 29);
        contentPane.add(btnRegister);

        JButton btnDeleteUser = new JButton("Delete User Panel");
        btnDeleteUser.setBounds(135, 41, 137, 29);
        contentPane.add(btnDeleteUser);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(6, 83, 117, 29);
        contentPane.add(btnLogout);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(135, 83, 137, 29);
        contentPane.add(btnBack);

        JLabel lblNewLabel = new JLabel("Admin Panel");
        lblNewLabel.setBounds(89, 13, 78, 16);
        contentPane.add(lblNewLabel);
    }

}
