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
public class Wallet {

    private static String BTCWallet, ETHWallet, BCHWallet, XRPWallet, DASHWallet, LTCWallet;

    protected static void setBTCWallet(String BTCWallet) {
        Wallet.BTCWallet = BTCWallet;
    }

    protected static void setETHWallet(String ETHWallet) {
        Wallet.ETHWallet = ETHWallet;
    }

    protected static void setBCHWallet(String BCHWallet) {
        Wallet.BCHWallet = BCHWallet;
    }

    protected static void setXRPWallet(String XRPWallet) {
        Wallet.XRPWallet = XRPWallet;
    }

    protected static void setDASHWallet(String DASHWallet) {
        Wallet.DASHWallet = DASHWallet;
    }

    protected static void setLTCWallet(String LTCWallet) {
        Wallet.LTCWallet = LTCWallet;
    }

    protected static String getBTCWallet() {
        return BTCWallet;
    }

    protected static String getETHWallet() {
        return ETHWallet;
    }

    protected static String getBCHWallet() {
        return BCHWallet;
    }

    protected static String getXRPWallet() {
        return XRPWallet;
    }

    protected static String getDASHWallet() {
        return DASHWallet;
    }

    protected static String getLTCWallet() {
        return LTCWallet;
    }
}
