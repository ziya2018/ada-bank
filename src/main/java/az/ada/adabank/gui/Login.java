package az.ada.adabank.gui;

import java.awt.event.WindowEvent;

/**
 *
 * @author Adil Aliyev
 */
public class Login extends javax.swing.JFrame {

    private javax.swing.JButton exitButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField loginTextBox;
    private javax.swing.JTextField passwordTextBox;
    private javax.swing.JButton loginButton;

    /**
     * Creates new form Main
     */
    public Login() {
        initComponents();
    }

    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginTextBox = new javax.swing.JTextField();
        passwordTextBox = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADABank Login");
        setMaximumSize(new java.awt.Dimension(305, 136));
        setMinimumSize(new java.awt.Dimension(305, 136));
        setResizable(false);

        loginLabel.setText("Username");

        passwordLabel.setText("Password");

        loginTextBox.setMaximumSize(new java.awt.Dimension(10, 27));

        passwordTextBox.setToolTipText("");
        passwordTextBox.setMaximumSize(new java.awt.Dimension(10, 27));

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(119, 119, 119)
                                                        .addComponent(loginButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(exitButton))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(passwordTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(0, 0, 0))))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(loginLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(loginTextBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loginLabel)
                                .addComponent(loginTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordLabel))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loginButton)
                                .addComponent(exitButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginButton.getAccessibleContext().setAccessibleName("loginButton");
        exitButton.getAccessibleContext().setAccessibleName("exitButton");

        pack();
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });

    }

}
