import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class ConnectionProvider {

    static Connection con = null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tbkb";
            String user = "root";
            String pwd = "";
            con= DriverManager.getConnection(url,user,pwd);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Database not connected!!");
        }
        return con;
    }
}