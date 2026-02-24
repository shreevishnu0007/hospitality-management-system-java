package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnection;

public class GuestDAO {

    public void addGuest(String name, String email, String phone) throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO guests(name,email,phone) VALUES(?,?,?)"
        );

        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, phone);

        ps.executeUpdate();
    }
}
