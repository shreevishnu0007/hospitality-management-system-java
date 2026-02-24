package ui;

import javax.swing.*;
import dao.GuestDAO;

public class AddGuestUI {

    public AddGuestUI() {

        JFrame f = new JFrame("Add Guest");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Email:");
        JLabel l3 = new JLabel("Phone:");

        JTextField t1 = new JTextField(15);
        JTextField t2 = new JTextField(15);
        JTextField t3 = new JTextField(15);

        JButton save = new JButton("Save Guest");

        JPanel p = new JPanel();
        p.add(l1); p.add(t1);
        p.add(l2); p.add(t2);
        p.add(l3); p.add(t3);
        p.add(save);

        save.addActionListener(e -> {
            try {
                new GuestDAO().addGuest(
                        t1.getText(),
                        t2.getText(),
                        t3.getText()
                );
                JOptionPane.showMessageDialog(f, "Guest Added Successfully");
                f.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(f, "Error adding guest");
            }
        });

        f.add(p);
        f.setSize(300, 250);
        f.setVisible(true);
    }
}
