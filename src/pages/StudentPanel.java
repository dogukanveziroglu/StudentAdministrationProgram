package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTextArea;

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
        setBounds(100, 100, 266, 347);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(155, 177, 80, 29);
        contentPane.add(btnLogout);

        JLabel lblStudentPanel = new JLabel("Student Panel");
        lblStudentPanel.setBounds(16, 6, 91, 16);
        contentPane.add(lblStudentPanel);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setBounds(155, 210, 98, 29);
        contentPane.add(btnMainMenu);

        JLabel lblName = new JLabel("");
        lblName.setBounds(16, 34, 117, 16);
        contentPane.add(lblName);

        JLabel lblLessons = new JLabel("Lessons");
        lblLessons.setBounds(16, 55, 71, 16);
        contentPane.add(lblLessons);

        JList listLessons = new JList();
        listLessons.setBounds(16, 83, 127, 156);
        contentPane.add(listLessons);

        JLabel lblGrade = new JLabel("Grade");
        lblGrade.setBounds(155, 61, 61, 16);
        contentPane.add(lblGrade);

        JLabel lblAbsence = new JLabel("Absence");
        lblAbsence.setBounds(155, 120, 61, 16);
        contentPane.add(lblAbsence);

        JTextArea txtGrade = new JTextArea();
        txtGrade.setBounds(155, 83, 41, 25);
        contentPane.add(txtGrade);

        JTextArea txtAbsence = new JTextArea();
        txtAbsence.setBounds(155, 140, 41, 25);
        contentPane.add(txtAbsence);
    }
}
