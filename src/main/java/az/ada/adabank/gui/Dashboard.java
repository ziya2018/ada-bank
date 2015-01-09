package az.ada.adabank.gui;

import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
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
    private JComboBox jComboBox1;
    private JList jList1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    private JTextArea jTextArea2;

    private GroupLayout layout;
    private GroupLayout jPanel1Layout;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jList1 = new JList();
        jComboBox1 = new JComboBox();
        personButton = new JButton();
        organizationButton = new JButton();
        jScrollPane3 = new JScrollPane();
        jTextArea2 = new JTextArea();
        accountButton = new JButton();
        transactionButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new AbstractListModel() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox1.setModel(new DefaultComboBoxModel(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

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

        setUpLayout();

        pack();
    }

    private void setUpLayout() {

        jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jComboBox1, 0, 181, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
                new Organization().setVisible(true);
            }
        });
    }

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
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
}
