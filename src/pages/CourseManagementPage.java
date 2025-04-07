package pages;

import models.Course;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CourseManagementPage extends JFrame {

    public static ArrayList<Course> courses = new ArrayList<>();

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCourseName;
    DefaultListModel<String> model;

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

        model = new DefaultListModel<>();
        JList listCourse = new JList(model);
        listCourse.setBounds(6, 35, 158, 228);
        contentPane.add(listCourse);

        JButton btnAddCourse = new JButton("Add Course");

        txtCourseName = new JTextField();
        txtCourseName.setBounds(180, 35, 130, 26);
        contentPane.add(txtCourseName);
        txtCourseName.setColumns(10);


        btnAddCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Course course = new Course();
                course.setId(Integer.parseInt(txtCourseName.getText().split(" ")[0]));
                course.setName(txtCourseName.getText().split(" ")[1]);

                model.addElement(course.getId() + " " + course.getName());

                courses.add(course);

                txtCourseName.setText("");

            }
        });


        btnAddCourse.setBounds(176, 73, 117, 29);
        contentPane.add(btnAddCourse);

        JButton btnDeleteCourse = new JButton("Delete Course");

        btnDeleteCourse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                courses.removeIf(c -> c.getId() == Integer.parseInt(listCourse.getSelectedValue().toString().split(" ")[0]));
                model.removeAllElements();

                for(Course c: courses){
                    model.addElement(c.getId() + " " + c.getName());
                }

            }
        });

        btnDeleteCourse.setBounds(176, 102, 117, 29);
        contentPane.add(btnDeleteCourse);

        JLabel lblNewLabel = new JLabel("Course List");
        lblNewLabel.setBounds(6, 7, 93, 16);
        contentPane.add(lblNewLabel);

        JButton btnMainMenu = new JButton("Main Menu");

        btnMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        btnMainMenu.setBounds(176, 131, 117, 29);
        contentPane.add(btnMainMenu);

        JLabel lblName = new JLabel("Course Name");
        lblName.setBounds(180, 19, 100, 16);
        contentPane.add(lblName);
    }
}
