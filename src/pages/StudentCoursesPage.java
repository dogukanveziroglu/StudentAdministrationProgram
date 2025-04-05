package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class StudentCoursesPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StudentCoursesPage frame = new StudentCoursesPage();
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
    public StudentCoursesPage() {
        setTitle("Student Courses Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JList listStudent = new JList();
        listStudent.setBounds(6, 44, 159, 222);
        contentPane.add(listStudent);

        JComboBox cbCourse = new JComboBox();
        cbCourse.setBounds(323, 40, 127, 27);
        contentPane.add(cbCourse);

        JButton btnAdd = new JButton("Add Course");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAdd.setBounds(327, 79, 117, 29);
        contentPane.add(btnAdd);

        JButton btnDelete = new JButton("Delete Course");
        btnDelete.setBounds(327, 120, 117, 29);
        contentPane.add(btnDelete);

        JLabel lblStudentList = new JLabel("Student List");
        lblStudentList.setBounds(6, 16, 108, 16);
        contentPane.add(lblStudentList);

        JLabel lblCourseList = new JLabel("Course List");
        lblCourseList.setBounds(177, 16, 93, 16);
        contentPane.add(lblCourseList);

        JList listCourse = new JList();
        listCourse.setBounds(171, 44, 140, 222);
        contentPane.add(listCourse);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setBounds(327, 156, 117, 29);
        contentPane.add(btnMainMenu);
    }
}
