
package ui;
import javax.swing.*;
import dao.ViewDAO;
public class ViewHotelsUI {
    public ViewHotelsUI(){
        try{
            JFrame f=new JFrame("Hotels");
            JTable t=new JTable(new ViewDAO().getHotels());
            f.add(new JScrollPane(t));
            f.setSize(400,300); f.setVisible(true);
        }catch(Exception e){e.printStackTrace();}
    }
}
