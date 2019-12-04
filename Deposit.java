package UAS;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Deposit {

    private String type;

    private String ID;

    private String from;

    private String to;

    private String amount;

    private String estimate;

    private String depositedBy;

    private Connection CRUDconnection;

    private PreparedStatement CRUDpsmt;

    private Statement CRUDstat;

    private ResultSet result;

    private ResultSet userData;

    private String massage;

    private String CRUDquery;

    private String generatedWallet;

    public Deposit() {
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

    public void setTransactionID(String ID) {
        this.ID = ID;
    }

    public void setReceiveFrom(String from) {
        this.from = from;
    }

    public void setSendTo(String to) {
        this.to = to;
    }

    public void setGeneratedWallet(String generatedWallet) {
        this.generatedWallet = generatedWallet;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public void setDepositedBy(String depositedBy) {
        this.depositedBy = depositedBy;
    }

    public String getType() {
        return type;
    }

    public String getTransactionID() {
        return ID;
    }

    public String getReceiveFrom() {
        return from;
    }

    public String getSendTo() {
        return to;
    }

    public String getGeneratedWallet() {
        return generatedWallet;
    }

    public String getAmount() {
        return amount;
    }

    public String getEstimate() {
        return estimate;
    }

    public String getDepositedBy() {
        return depositedBy;
    }

    public String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public void saveWalletETH(String email) {
        int n = 40;
        String settingWallet = "0x" + getAlphaNumericString(n);
        CRUDquery = "UPDATE `user` SET `eth_addr`= ? WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, settingWallet);
            CRUDpsmt.setString(2, email);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveWalletBTC(String email) {
        int n = 33;
        String settingWallet = "1" + getAlphaNumericString(n);
        CRUDquery = "UPDATE `user` SET `btc_addr`= ? WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, settingWallet);
            CRUDpsmt.setString(2, email);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveWalletBCH(String email) {
        int n = 33;
        String settingWallet = "3" + getAlphaNumericString(n);
        CRUDquery = "UPDATE `user` SET `bch_addr`= ? WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, settingWallet);
            CRUDpsmt.setString(2, email);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveWalletXRP(String email) {
        int n = 33;
        String settingWallet = "r" + getAlphaNumericString(n);
        CRUDquery = "UPDATE `user` SET `xrp_addr`= ? WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, settingWallet);
            CRUDpsmt.setString(2, email);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveWalletDASH(String email) {
        int n = 34;
        String settingWallet = "X" + getAlphaNumericString(n);
        CRUDquery = "UPDATE `user` SET `dash_addr`= ? WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, settingWallet);
            CRUDpsmt.setString(2, email);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveWalletLTC(String email) {
        int n = 34;
        String settingWallet = "L" + getAlphaNumericString(n);
        CRUDquery = "UPDATE `user` SET `ltc_addr`= ? WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, settingWallet);
            CRUDpsmt.setString(2, email);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveData(String by, String type, String from, String to, String amount, String estimate) {
        CRUDquery = "INSERT INTO `deposit`(`deposited_by`, `crypto_type`, `received_from`, `send_to`, `amount`, `estimate`) VALUES (?,?,?,?,?,?)";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, by);
            CRUDpsmt.setString(2, type);
            CRUDpsmt.setString(3, from);
            CRUDpsmt.setString(4, to);
            CRUDpsmt.setString(5, amount);
            CRUDpsmt.setString(6, estimate);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet seeData() {
        CRUDquery = "SELECT * FROM `deposit`";
        try {
            CRUDstat = CRUDconnection.createStatement();
            result = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e) {
        }
        return result;
    }

    public String seeUpdatedWallet(String email) {
        CRUDquery = "SELECT `btc_addr`, `eth_addr`, `bch_addr`, `xrp_addr`, `dash_addr`, `ltc_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setBTCWallet(userData.getString("btc_addr"));
                Session.setETHWallet(userData.getString("eth_addr"));
                Session.setBCHWallet(userData.getString("bch_addr"));
                Session.setXRPWallet(userData.getString("xrp_addr"));
                Session.setDASHWallet(userData.getString("dash_addr"));
                Session.setLTCWallet(userData.getString("ltc_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }

    public void deleteHistory(String ID) {
        CRUDquery = "delete from deposit where id=?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, ID);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
        }
    }
}
