package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CourseManagementPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCourseName;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CourseManagementPage frame = new CourseManagementPage();
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
    public CourseManagementPage() {
        setTitle("Course Management Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 333, 297);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JList listCourse = new JList();
        listCourse.setBounds(6, 35, 158, 228);
        contentPane.add(listCourse);

        JButton btnAddCourse = new JButton("Add Course");
        btnAddCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAddCourse.setBounds(176, 73, 117, 29);
        contentPane.add(btnAddCourse);

        txtCourseName = new JTextField();
        txtCourseName.setBounds(180, 35, 130, 26);
        contentPane.add(txtCourseName);
        txtCourseName.setColumns(10);

        JButton btnDeleteCourse = new JButton("Delete Course");
        btnDeleteCourse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnDeleteCourse.setBounds(176, 102, 117, 29);
        contentPane.add(btnDeleteCourse);

        JLabel lblNewLabel = new JLabel("Course List");
        lblNewLabel.setBounds(6, 7, 93, 16);
        contentPane.add(lblNewLabel);

        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setBounds(176, 131, 117, 29);
        contentPane.add(btnMainMenu);
    }
}
