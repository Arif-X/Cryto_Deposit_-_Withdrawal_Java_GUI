/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class Profile {

    private Connection CRUDconnection;

    private PreparedStatement CRUDpsmt;

    private Statement CRUDstat;

    private ResultSet userData;

    private String CRUDquery;

    private String massage;

    public Profile() {
        try {
            Koneksi connection = new Koneksi();
            CRUDconnection = connection.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void saveData(String email, String name, String address, String password, String userID) {
        CRUDquery = "UPDATE `user` SET `email` = ?, `username` = ?, `address` = ?, `password` = md5(?) WHERE email = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            CRUDpsmt.setString(2, name);
            CRUDpsmt.setString(3, address);
            CRUDpsmt.setString(4, password);
            CRUDpsmt.setString(5, userID);
            CRUDpsmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String seeData(String userID) {
        CRUDquery = "SELECT `name`, `email`, `address`, `password`, `BTC_Wallet`, `BTC_Wallet`, `ETH_Wallet`, `BCH_Wallet`, `XRP_Wallet`, `DASH_Wallet`, `LTC_Wallet` FROM user WHERE `user_id` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, userID);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(userID);
                Session.setName(userData.getString("name"));
                Session.setLoginStatus("Active");
                Session.setEmail(userData.getString("email"));
                Session.setAddress(userData.getString("address"));
                Session.setPassword(userData.getString("password"));
                Session.setBTCWallet(userData.getString("BTC_Wallet"));
                Session.setETHWallet(userData.getString("ETH_Wallet"));
                Session.setBCHWallet(userData.getString("BCH_Wallet"));
                Session.setXRPWallet(userData.getString("XRP_Wallet"));
                Session.setDASHWallet(userData.getString("DASH_Wallet"));
                Session.setLTCWallet(userData.getString("LTC_Wallet"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedName(String email) {
        CRUDquery = "SELECT `username` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setName(userData.getString("username"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedAddress(String email) {
        CRUDquery = "SELECT `address` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setAddress(userData.getString("address"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedPassword(String email) {
        CRUDquery = "SELECT `password` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setAddress(userData.getString("password"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedWalletBTC(String email) {
        CRUDquery = "SELECT `btc_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setBTCWallet(userData.getString("btc_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedWalletETH(String email) {
        CRUDquery = "SELECT `eth_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setETHWallet(userData.getString("eth_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedWalletBCH(String email) {
        CRUDquery = "SELECT `bch_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setBCHWallet(userData.getString("bch_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedWalletXRP(String email) {
        CRUDquery = "SELECT `xrp_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setXRPWallet(userData.getString("xrp_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedWalletDASH(String email) {
        CRUDquery = "SELECT `dash_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setDASHWallet(userData.getString("dash_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
    
    public String seeUpdatedWalletLTC(String email) {
        CRUDquery = "SELECT `ltc_addr` FROM user WHERE `email` = ?";
        try {
            CRUDpsmt = CRUDconnection.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, email);
            userData = CRUDpsmt.executeQuery();
            if (userData.next()) {
                Session.setUserID(email);
                Session.setLTCWallet(userData.getString("ltc_addr"));
            }
        } catch (Exception e) {

        }
        return massage;
    }
}
