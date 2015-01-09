package az.ada.adabank;

import az.ada.adabank.entities.Account;
import az.ada.adabank.entities.Currency;
import az.ada.adabank.entities.Customer;
import az.ada.adabank.entities.Transaction;
import az.ada.adabank.gui.Login;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Adil Aliyev
 */
public class Main {

    public static Map<String, Customer> customers = null;
    public static Map<String, Account> accounts = null;
    public static Map<String, Currency> currencies = null;
    public static List<Transaction> transactions = null;

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
