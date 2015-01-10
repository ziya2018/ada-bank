package az.ada.adabank.gui;

import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

/**
 *
 * @author Emil Aghjayev
 * @author Adil Aliyev
 */
public class Login extends JFrame {

    private JButton exitButton;
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JTextField loginTextBox;
    private JTextField passwordTextBox;
    private JButton loginButton;

    /**
     * Creates new form Main
     */
    public Login() {
        initComponents();
    }

    private void initComponents() {

        loginLabel = new JLabel();
        passwordLabel = new JLabel();
        loginTextBox = new JTextField();
        passwordTextBox = new JTextField();
        loginButton = new JButton();
        exitButton = new JButton();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("ADABank Login");
        setMaximumSize(new Dimension(305, 136));
        setMinimumSize(new Dimension(305, 136));
        setResizable(false);

        loginLabel.setText("Username");

        passwordLabel.setText("Password");

        loginTextBox.setMaximumSize(new Dimension(10, 27));

        passwordTextBox.setToolTipText("");
        passwordTextBox.setMaximumSize(new Dimension(10, 27));

        loginButton.setText("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordLabel)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(119, 119, 119)
                                                        .addComponent(loginButton)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(exitButton))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(passwordTextBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(0, 0, 0))))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(loginLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(loginTextBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(loginLabel)
                                .addComponent(loginTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordTextBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordLabel))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(loginButton)
                                .addComponent(exitButton))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginButton.getAccessibleContext().setAccessibleName("loginButton");
        exitButton.getAccessibleContext().setAccessibleName("exitButton");

        pack();
    }

    private void exitButtonActionPerformed(ActionEvent evt) {

        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void loginButtonActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });

    }

}
