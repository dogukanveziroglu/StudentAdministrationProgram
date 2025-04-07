package pages;

import data.UserStore;
import models.User;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeleteUserPanel extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    DefaultListModel model = new DefaultListModel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeleteUserPanel frame = new DeleteUserPanel();
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
    public DeleteUserPanel() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 321, 309);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        for (User u : UserStore.users) {
            model.addElement(u.getId() + " " + u.getName() + " " + u.getSurname());
        }

        JTextArea textArea = new JTextArea();
        textArea.setBounds(163, 40, 152, 187);
        contentPane.add(textArea);

        JList list = new JList(model);
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                int id = Integer.parseInt(list.getSelectedValue().toString().split(" ")[0]);

                for (User user : UserStore.users) {
                    if (user.getId() == id) {
                        textArea.setText("ID" + user.getId()
                                + "Name: " + user.getName()
                                + "Surname" + user.getSurname()
                                + "Email" + user.getEmail()
                                + "Role" + user.getRole()
                        );
                        break;
                    }
                }

            }
        });


        list.setBounds(6, 40, 145, 187);
        contentPane.add(list);

        JButton btnDelete = new JButton("Delete");

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int id = Integer.parseInt(list.getSelectedValue().toString());
                UserStore.users.removeIf(s -> s.getId() == id);

                model.removeAllElements();

                for (User u : UserStore.users) {
                    model.addElement(u.getId() + " " + u.getName() + " " + u.getSurname());
                }

            }
        });
        btnDelete.setBounds(16, 239, 117, 29);
        contentPane.add(btnDelete);

        JButton btnBack = new JButton("Back");

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminPanel adminPanel = new AdminPanel();
                adminPanel.setVisible(true);
                dispose();
            }
        });

        btnBack.setBounds(173, 239, 117, 29);
        contentPane.add(btnBack);

        JLabel lblNewLabel = new JLabel("User List");
        lblNewLabel.setBounds(16, 12, 61, 16);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Details");
        lblNewLabel_1.setBounds(163, 12, 61, 16);
        contentPane.add(lblNewLabel_1);
    }

}
