package az.ada.adabank;

import az.ada.adabank.entities.Account;
import az.ada.adabank.entities.Currency;
import az.ada.adabank.entities.Customer;
import az.ada.adabank.entities.Transaction;
import az.ada.adabank.gui.Login;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Adil Aliyev
 * @author Ziya Rustamov
 */
public class Main {

    public static Map<Integer, Customer> customers = null;
    public static Map<Integer, Account> accounts = null;
    public static Map<String, Currency> currencies = null;
    public static List<Transaction> transactions = null;
    
    public static int customerIdSequence = 0;
    public static int accountNumberSequence = 0;

    public static void main(String args[]) {
        customers = new HashMap<>();
        accounts = new HashMap<>();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
