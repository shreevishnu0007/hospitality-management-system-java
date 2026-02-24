
package dao;
import java.sql.*;
import util.DBConnection;
public class ReservationDAO {
    public void reserve(int roomId,int guestId,String in,String out)throws Exception{
        Connection con=DBConnection.getConnection();
        PreparedStatement ps=con.prepareStatement(
        "INSERT INTO reservations(room_id,guest_id,check_in,check_out) VALUES(?,?,?,?)");
        ps.setInt(1,roomId); ps.setInt(2,guestId);
        ps.setString(3,in); ps.setString(4,out);
        ps.executeUpdate();
    }
}
