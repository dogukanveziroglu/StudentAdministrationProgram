package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class StudentGradesPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentGradesPage frame = new StudentGradesPage();
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
    public StudentGradesPage() {
        setTitle("Student Grades Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 332);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JList listCourse = new JList();
        listCourse.setBounds(171, 68, 140, 222);
        contentPane.add(listCourse);

        JList listStudent = new JList();
        listStudent.setBounds(6, 68, 159, 222);
        contentPane.add(listStudent);

        JLabel lblCourseList = new JLabel("Course List");
        lblCourseList.setBounds(177, 40, 93, 16);
        contentPane.add(lblCourseList);

        JLabel lblStudentList = new JLabel("Student List");
        lblStudentList.setBounds(6, 40, 108, 16);
        contentPane.add(lblStudentList);

        JComboBox cbGrade = new JComboBox();
        cbGrade.setBounds(323, 114, 61, 27);
        contentPane.add(cbGrade);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnSave.setBounds(323, 145, 71, 29);
        contentPane.add(btnSave);

        JLabel lblGrades = new JLabel("Grades");
        lblGrades.setBounds(323, 40, 61, 16);
        contentPane.add(lblGrades);

        JTextArea txtGrade = new JTextArea();
        txtGrade.setBounds(323, 68, 45, 34);
        contentPane.add(txtGrade);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setBounds(309, 173, 111, 29);
        contentPane.add(btnMainMenu);
    }

}
