package pages;

import data.UserStore;
import models.Student;
import models.User;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class AttendancePage extends JFrame {
    DefaultListModel<String> model = new DefaultListModel<>();

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AttendancePage frame = new AttendancePage();
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
    public AttendancePage() {

        for(User u : UserStore.users){
            if(u.getRole().equals("Student")){
                model.addElement(u.getId() + " " + u.getName());
            }
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 467, 311);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JList listStudent = new JList(model);

        listStudent.setBounds(6, 54, 159, 222);
        contentPane.add(listStudent);

        JLabel lblStudentList = new JLabel("Student List");
        lblStudentList.setBounds(6, 26, 108, 16);
        contentPane.add(lblStudentList);

        JLabel lblAbsence = new JLabel("Absence");
        lblAbsence.setBounds(175, 26, 86, 16);
        contentPane.add(lblAbsence);

        JCheckBox chckbx1 = new JCheckBox("Week 1");
        chckbx1.setBounds(177, 50, 128, 23);
        contentPane.add(chckbx1);

        JCheckBox chckbx2 = new JCheckBox("Week 2");
        chckbx2.setBounds(177, 85, 128, 23);
        contentPane.add(chckbx2);

        JCheckBox chckbx3 = new JCheckBox("Week 3");
        chckbx3.setBounds(177, 120, 128, 23);
        contentPane.add(chckbx3);

        JCheckBox chckbx4 = new JCheckBox("Week 4");
        chckbx4.setBounds(177, 155, 128, 23);
        contentPane.add(chckbx4);

        JCheckBox chckbx5 = new JCheckBox("Week 5");
        chckbx5.setBounds(177, 190, 128, 23);
        contentPane.add(chckbx5);

        JCheckBox chckbx6 = new JCheckBox("Week 6");
        chckbx6.setBounds(177, 225, 128, 23);
        contentPane.add(chckbx6);

        JCheckBox chckbx11 = new JCheckBox("Week 11");
        chckbx11.setBounds(317, 190, 128, 23);
        contentPane.add(chckbx11);

        JCheckBox chckbx12 = new JCheckBox("Week 12");
        chckbx12.setBounds(317, 225, 128, 23);
        contentPane.add(chckbx12);

        JCheckBox chckbx10 = new JCheckBox("Week 10");
        chckbx10.setBounds(317, 155, 128, 23);
        contentPane.add(chckbx10);

        JCheckBox chckbx9 = new JCheckBox("Week 9");
        chckbx9.setBounds(317, 120, 128, 23);
        contentPane.add(chckbx9);

        JCheckBox chckbx8 = new JCheckBox("Week 8");
        chckbx8.setBounds(317, 85, 128, 23);
        contentPane.add(chckbx8);

        JCheckBox chckbx7 = new JCheckBox("Week 7");
        chckbx7.setBounds(317, 50, 128, 23);
        contentPane.add(chckbx7);

        JButton btnMainMenu = new JButton("Main Menu");

        btnMainMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                dispose();
            }
        });

        btnMainMenu.setBounds(317, 248, 117, 29);
        contentPane.add(btnMainMenu);

        JButton btnSave = new JButton("Save");

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = listStudent.getSelectedIndex();

                if (index == -1){
                    JOptionPane.showMessageDialog(contentPane,"Please select a student");
                    return;
                }

                for(User u : UserStore.users){
                    if(u.getId() == (Integer.parseInt(listStudent.getSelectedValue().toString().split(" ")[0]))){

                        int totalAbsence = 0;
                        if (chckbx1.isSelected()) totalAbsence++;
                        if (chckbx2.isSelected()) totalAbsence++;
                        if (chckbx3.isSelected()) totalAbsence++;
                        if (chckbx4.isSelected()) totalAbsence++;
                        if (chckbx5.isSelected()) totalAbsence++;
                        if (chckbx6.isSelected()) totalAbsence++;
                        if (chckbx7.isSelected()) totalAbsence++;
                        if (chckbx8.isSelected()) totalAbsence++;
                        if (chckbx9.isSelected()) totalAbsence++;
                        if (chckbx10.isSelected()) totalAbsence++;
                        if (chckbx11.isSelected()) totalAbsence++;
                        if (chckbx12.isSelected()) totalAbsence++;

                        Student student = (Student) u;
                        student.setAbsence(totalAbsence);

                        chckbx1.setSelected(false);
                        chckbx2.setSelected(false);
                        chckbx3.setSelected(false);
                        chckbx4.setSelected(false);
                        chckbx5.setSelected(false);
                        chckbx6.setSelected(false);
                        chckbx7.setSelected(false);
                        chckbx8.setSelected(false);
                        chckbx9.setSelected(false);
                        chckbx10.setSelected(false);
                        chckbx11.setSelected(false);
                        chckbx12.setSelected(false);

                    }
                }

            }
        });


        btnSave.setBounds(174, 247, 117, 29);
        contentPane.add(btnSave);
    }
}
