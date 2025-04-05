package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TeacherPanel extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TeacherPanel frame = new TeacherPanel();
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
    public TeacherPanel() {
        setTitle("Teacher Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 262, 213);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnCourses = new JButton("Manage Courses");
        btnCourses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCourses.setBounds(6, 62, 127, 29);
        contentPane.add(btnCourses);

        JButton btnGrades = new JButton("Assign grades");
        btnGrades.setBounds(135, 62, 121, 29);
        contentPane.add(btnGrades);

        JButton btnAttendance = new JButton("Attendance");
        btnAttendance.setBounds(6, 103, 127, 29);
        contentPane.add(btnAttendance);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(135, 103, 121, 29);
        contentPane.add(btnLogout);

        JLabel lblNewLabel = new JLabel("Teacher Panel");
        lblNewLabel.setBounds(87, 34, 96, 16);
        contentPane.add(lblNewLabel);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setBounds(76, 139, 117, 29);
        contentPane.add(btnMainMenu);
    }
}
