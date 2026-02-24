
package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // IMPORTANT
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospitality_db",
                "root",
                "vishnu@0007"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

