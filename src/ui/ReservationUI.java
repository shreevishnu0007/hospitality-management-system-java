
package ui;
import javax.swing.*;
import dao.ReservationDAO;
public class ReservationUI {
    public ReservationUI(){
        JFrame f=new JFrame("New Reservation");
        JTextField r=new JTextField(5), g=new JTextField(5),
        in=new JTextField(8), out=new JTextField(8);
        JButton save=new JButton("Reserve");
        JPanel p=new JPanel();
        p.add(new JLabel("RoomId"));p.add(r);
        p.add(new JLabel("GuestId"));p.add(g);
        p.add(new JLabel("CheckIn"));p.add(in);
        p.add(new JLabel("CheckOut"));p.add(out);
        p.add(save);
        save.addActionListener(e->{
            try{
                new ReservationDAO().reserve(
                Integer.parseInt(r.getText()),
                Integer.parseInt(g.getText()),
                in.getText(),out.getText());
                JOptionPane.showMessageDialog(f,"Reserved");
            }catch(Exception ex){ex.printStackTrace();}
        });
        f.add(p); f.pack(); f.setVisible(true);
    }
}
