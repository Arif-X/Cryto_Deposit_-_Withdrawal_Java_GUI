package UAS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Withdraw {

    private String type;

    private String email;

    private String from;

    private String to;

    private String amount;

    private String estimate;

    private String withdrawedBy;

    private Connection CRUDconnection;

    private PreparedStatement CRUDpsmt;

    private Statement CRUDstat;

    private ResultSet result;

    private String CRUDquery;

    public Withdraw() {
        try {
            Koneksi connection = new Koneksi();
            CRUDconnection = connection.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTransactionID(String email) {
        this.email = email;
    }

    public void setReceiveFrom(String from) {
        this.from = from;
    }

    public void setSendTo(String to) {
        this.to = to;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public void setWithdrawedBy(String withdrawedBy) {
        this.withdrawedBy = withdrawedBy;
    }

    public String getType() {
        return type;
    }

    public String getTransactionID() {
        return email;
    }

    public String getReceiveFrom() {
        return from;
    }

    public String getSendTo() {
        return to;
    }

    public String getAmount() {
        return amount;
    }

    public String getEstimate() {
        return estimate;
    }

    public String getWithdrawedBy() {
        return withdrawedBy;
    }

    public void saveData(String email, String type, String withdrawedTo, String receivedFrom, String amount, String estimate) {
        CRUDquery = "INSERT INTO `withdraw`(`withdrawed_by`, `crypto_type`, `withdraw_to`, `received_from`, `amount`, `estimate`) VALUES (?,?,?,?,?,?)";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            CRUDpsmt.setString(2, type);
            CRUDpsmt.setString(3, withdrawedTo);
            CRUDpsmt.setString(4, receivedFrom);
            CRUDpsmt.setString(5, amount);
            CRUDpsmt.setString(6, estimate);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet seeData() {
        CRUDquery = "SELECT * FROM `withdraw`";
        try {
            CRUDstat = CRUDconnection.createStatement();
            result = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e) {
        }
        return result;
    }

    public ResultSet seeWallet(String userID) {
        CRUDquery = "SELECT `wallet` from `user` where `user_id` = ?";
        try {
            CRUDstat = CRUDconnection.createStatement();
            result = CRUDstat.executeQuery(CRUDquery);
            CRUDpsmt.setString(1, userID);
        } catch (Exception e) {
        }
        return result;
    }

    public void deleteHistory(String ID) {
        CRUDquery = "delete from withdraw where id=?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, ID);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
        }
    }
}
