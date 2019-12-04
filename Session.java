/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Lenovo
 */
public class Session extends Wallet {

    private static String name, userID, password, loginStatus;
    private static String address, email;
    
    protected static void setName(String name) {
        Session.name = name;
    }

    protected static void setUserID(String userID) {
        Session.userID = userID;
    }

    protected static void setEmail(String email) {
        Session.email = email;
    }

    protected static void setPassword(String password) {
        Session.password = password;
    }

    protected static void setLoginStatus(String loginStatus) {
        Session.loginStatus = loginStatus;
    }

    protected static void setAddress(String address) {
        Session.address = address;
    }

    protected static String getName() {
        return name;
    }

    protected static String getUserID() {
        return userID;
    }

    protected static String getEmail() {
        return email;
    }

    protected static String getPassword() {
        return password;
    }

    protected static String getLoginStatus() {
        return loginStatus;
    }

    protected static String getAddress() {
        return address;
    }
}