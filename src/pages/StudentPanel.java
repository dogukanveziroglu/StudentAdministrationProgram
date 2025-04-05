package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class StudentPanel extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
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
        setTitle("Student Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 327, 224);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Courses");
        btnNewButton.setBounds(38, 50, 117, 29);
        contentPane.add(btnNewButton);

        JButton btnGrades = new JButton("Grades");
        btnGrades.setBounds(167, 50, 117, 29);
        contentPane.add(btnGrades);

        JButton btnAttendance = new JButton("Attendance");
        btnAttendance.setBounds(38, 91, 117, 29);
        contentPane.add(btnAttendance);

        JButton btnEnroll = new JButton("Enroll Courses");
        btnEnroll.setBounds(167, 91, 117, 29);
        contentPane.add(btnEnroll);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(106, 132, 117, 29);
        contentPane.add(btnLogout);

        JLabel lblStudentPanel = new JLabel("Student Panel");
        lblStudentPanel.setBounds(119, 22, 91, 16);
        contentPane.add(lblStudentPanel);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setBounds(106, 161, 117, 29);
        contentPane.add(btnMainMenu);
    }
}
