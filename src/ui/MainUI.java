package ui;

import javax.swing.*;

public class MainUI {

    public static void main(String[] args) {

        JFrame f = new JFrame("Hospitality Management System");

        JButton hotel = new JButton("View Hotels");
        JButton guest = new JButton("Add Guest");
        JButton reserve = new JButton("Reservation");

        JPanel p = new JPanel();
        p.add(hotel);
        p.add(guest);
        p.add(reserve);

        hotel.addActionListener(e -> new ViewHotelsUI());
        guest.addActionListener(e -> new AddGuestUI());
        reserve.addActionListener(e -> new ReservationUI());

        f.add(p);
        f.setSize(450, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

