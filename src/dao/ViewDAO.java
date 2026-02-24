
package dao;
import java.sql.*;
import util.DBConnection;
import javax.swing.table.DefaultTableModel;

public class ViewDAO {
    public DefaultTableModel getHotels() throws Exception{
        DefaultTableModel m=new DefaultTableModel(new String[]{"ID","Name","Location"},0);
        Connection c=DBConnection.getConnection();
        ResultSet rs=c.createStatement().executeQuery("SELECT * FROM hotels");
        while(rs.next()) m.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3)});
        return m;
    }
}
