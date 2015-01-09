package az.ada.adabank;

import az.ada.adabank.gui.Login;

/**
 *
 * @author Adil Aliyev
 */
public class Main {

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
