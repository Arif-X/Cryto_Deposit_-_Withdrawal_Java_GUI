package UAS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

    private String email;

    private String password;

    private Connection CRUDconnection;

    private PreparedStatement CRUDpsmt;

    private Statement CRUDstat;

    private ResultSet userData;

    private String CRUDquery;

    private String massage;

    Session ob = new Session();

    public Login() {
        try {
            Koneksi connection = new Koneksi();
            CRUDconnection = connection.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String loginCheck(String email, String password) {
        CRUDquery = "SELECT `username`, `email`, `address`, `password`, `btc_addr`, `eth_addr`, `bch_addr`, `xrp_addr`, `dash_addr`, `ltc_addr` FROM user WHERE `email` = ? AND `password` = md5(?)";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            CRUDpsmt.setString(2, password);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setName(userData.getString("username"));                
                Session.setEmail(userData.getString("email"));
                Session.setAddress(userData.getString("address"));
                Session.setLoginStatus("Active");
                Session.setPassword(userData.getString("password"));
                ob.setBTCWallet(userData.getString("btc_addr"));
                ob.setETHWallet(userData.getString("eth_addr"));
                ob.setBCHWallet(userData.getString("bch_addr"));
                ob.setXRPWallet(userData.getString("xrp_addr"));
                ob.setDASHWallet(userData.getString("dash_addr"));
                ob.setLTCWallet(userData.getString("ltc_addr"));
                CRUDquery = "INSERT INTO login_log (user_id) VALUES (?)";
                try {
                    CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
                    CRUDpsmt.setString(1, email);
                    CRUDpsmt.executeUpdate();
                    CRUDpsmt.close();
                } catch (Exception e) {
                    massage = "Log Can't Saved";
                }
            } else {
                massage = "Can't Login";
            }
        } catch (Exception e) {
            massage = "Error Query";
        }
        return massage;
    }

    public void logout() {
        CRUDquery = "UPDATE login_log SET logout_time = CURRENT_TIMESTAMP() WHERE user_id = '" + Session.getEmail()+ "' ORDER BY id DESC LIMIT 1";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            CRUDconnection.close();
            Session.setUserID(null);
            Session.setName(null);
            Session.setLoginStatus(null);
        } catch (Exception e) {

        }
    }
}
