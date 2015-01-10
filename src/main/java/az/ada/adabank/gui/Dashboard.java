package az.ada.adabank.gui;

import az.ada.adabank.Main;
import az.ada.adabank.entities.Account;
import az.ada.adabank.entities.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

/**
 *
 * @author Adil Aliyev
 */
public class Dashboard extends JFrame {

    private JButton personButton;
    private JButton organizationButton;
    private JButton accountButton;
    private JButton transactionButton;
    public static JComboBox customersComboBox;
    private JList accountsList;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    private JTextArea jTextArea2;
    DefaultListModel model;
    private GroupLayout layout;
    private GroupLayout jPanel1Layout;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    private void initComponents() {
        model = new DefaultListModel();
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        accountsList = new JList(model);
        customersComboBox = new JComboBox();
        personButton = new JButton();
        organizationButton = new JButton();
        jScrollPane3 = new JScrollPane();
        jTextArea2 = new JTextArea();
        accountButton = new JButton();
        transactionButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(accountsList);

        customersComboBox.setModel(new DefaultComboBoxModel(new String[]{}));

        personButton.setText("New Person");

        organizationButton.setText("New Organization");

        accountButton.setText("New Account");

        transactionButton.setText("New Transaction");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        personButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personButtonActionPerformed(evt);
            }
        });

        organizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                organizationButtonActionPerformed(evt);
            }
        });

        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                transactionButtonActionPerformed(evt);
            }
        });

        customersComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                loadAccounts(e);
            }
        });

        setUpLayout();

        pack();
    }

    private void setUpLayout() {

        jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(customersComboBox, 0, 181, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(customersComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addContainerGap())
        );

        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(personButton)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(organizationButton)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(accountButton)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(transactionButton)
                                        .addGap(0, 32, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3)
                                        .addContainerGap())))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(personButton)
                                .addComponent(organizationButton)
                                .addComponent(accountButton)
                                .addComponent(transactionButton)
                        )
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)
                        .addContainerGap())
        );
    }

    private void personButtonActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Person().setVisible(true);
            }
        });

    }

    private void organizationButtonActionPerformed(java.awt.event.ActionEvent evt) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrganizationWindow().setVisible(true);
            }
        });
    }

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountWindow().setVisible(true);
            }
        });
    }

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    private void loadAccounts(java.awt.event.ActionEvent evt) {

        model.clear();
        if (customersComboBox.getItemCount() > 0) {
            Customer currentCustomer = Main.customers.get(customersComboBox.getSelectedIndex());

            for (Account account : Main.accounts.values()) {
                if (account.getCustomer().equals(currentCustomer)) {
                    model.addElement(account);
                }
            }
        }

    }

}
