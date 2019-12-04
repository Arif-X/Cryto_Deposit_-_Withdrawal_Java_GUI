package UAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private Connection connect;
    private String driverName = "com.mysql.jdbc.Driver";
    private String jdbc = "jdbc:mysql://";
    private String host = "localhost:";
    private String port = "3306/";
    private String database = "coba_pbo";
    private String url = jdbc + host + port + database;
    private String username = "root";
    private String password = "";

    public Connection getConnection() throws SQLException {
        if (connect == null) {
            try {
                Class.forName(driverName);
                try {
                    connect = DriverManager.getConnection(url, username, password);
                } catch (SQLException se) {
                }
            } catch (ClassNotFoundException cnfe) {
                System.exit(0);
            }
        }
        return connect;
    }
    
    public static void main(String[] args) throws SQLException {
        Koneksi ob = new Koneksi();
        ob.getConnection();
    }
}
