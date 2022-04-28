/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregister;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author 1styrGroupB
 */
public class LogInPage extends javax.swing.JFrame {

    /**
     * Creates new form LogInPage
     */
    public LogInPage() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        LogIn = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jCheckBoxshowpass = new javax.swing.JCheckBox();
        jButtonReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password: ");

        username.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        password.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        LogIn.setBackground(new java.awt.Color(153, 153, 153));
        LogIn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        LogIn.setText("Log In");
        LogIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(153, 153, 153));
        jButtonRegister.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseClicked(evt);
            }
        });

        jCheckBoxshowpass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBoxshowpass.setText("Show Password");
        jCheckBoxshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxshowpassActionPerformed(evt);
            }
        });

        jButtonReset.setBackground(new java.awt.Color(153, 153, 153));
        jButtonReset.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 153, 0));
        jLabel3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  Login Form");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCheckBoxshowpass)
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxshowpass)
                .addGap(41, 41, 41)
                .addComponent(jButtonReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn)
                    .addComponent(jButtonRegister))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        PreparedStatement st;
        ResultSet rs;

        // get the username & password
//
//        //create a select query to check if the username and the password exist in the database
//        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
//
//        // show a message if the username or the password fields are empty
//        if (username.trim().equals("username")) {
//            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
//        } else if (password.trim().equals("password")) {
//            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
//        } else {
//
//            try {
//                st = My_CNX.getConnection().prepareStatement(query);
//
//                st.setString(1, username);
//                st.setString(2, password);
//                rs = st.executeQuery();
//
//                if (rs.next()) {
//                    // show a new form
//                    Menu_Form form = new Menu_Form();
//                    form.setVisible(true);
//                    form.pack();
//                    form.setLocationRelativeTo(null);
//                    // close the current form(login form)
//                    this.dispose();
//
//                } else {
//                    // error message
//                    JOptionPane.showMessageDialog(null, "Invalid Username / Password", "Login Error", 2);
//                }
//
//            } catch (SQLException ex) {
//                Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_LogInActionPerformed

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
//        if (evt.getSource() == LogIn) {
//            String userText;
//            String pwdText;
//            userText = username.getText();
//            pwdText = password.getText();
//            if (userText.equalsIgnoreCase("Juls") && pwdText.equalsIgnoreCase("Estorco")) {
//                JOptionPane.showMessageDialog(this, "Login Successfully");
//                UsersInfo ui = new UsersInfo();
//                ui.setVisible(true);
//                ui.pack();
//                ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                this.dispose();
//                
//            } else {
//                JOptionPane.showMessageDialog(this, "Login Successful");
//            }
//        }

        String uname = username.getText();
        String pass = String.valueOf(password.getPassword());

        try {

            Class.forName("com.mysql.jdbc.Driver");

            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "")) {

                Statement stmt = con.createStatement();

                String query1 = "SELECT * FROM registration_info WHERE Username = '" + uname + "' and Password = '" + pass + "'";

                ResultSet rs = stmt.executeQuery(query1);

                if (rs.next()) {

                    uname = rs.getString("Name");

                    dispose();//close login page

                    new UsersInfo().setVisible(true);

                } else {

                    JOptionPane.showMessageDialog(this, "Account doesn't exist, Register first!", "Alert", JOptionPane.ERROR_MESSAGE);
//
//                    uname.setText(null);
//
//                    password.setText(null);
                }
            }

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_LogInMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if (username.getText().trim().toLowerCase().equals("username")) {
            username.setText("");
        }

    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // if the text field is equal to username or empty
        // we will set the "username" text in the field 
        // on focus lost event

        if (username.getText().trim().equals("")
                || username.getText().trim().toLowerCase().equals("username")) {
            username.setText("username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // clear the password field on focus if the text is "password"

        // get the password text
        String pass = String.valueOf(password.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // if the password field is equal to password or empty
        // we will set the "password" text in the field 
        // on focus lost event

        // get the password text
        String pass = String.valueOf(password.getPassword());

        if (pass.trim().equals("")
                || pass.trim().toLowerCase().equals("password")) {
            password.setText("password");
        }
    }//GEN-LAST:event_passwordFocusLost

    private void jButtonRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseClicked
        Register r = new Register();
        r.setVisible(true);
        r.pack();
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_jButtonRegisterMouseClicked

    private void jCheckBoxshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxshowpassActionPerformed
        if (evt.getSource() == jCheckBoxshowpass) {
            if (jCheckBoxshowpass.isSelected()) {
                password.setEchoChar((char) 0);
            } else {
                password.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_jCheckBoxshowpassActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        if (evt.getSource() == jButtonReset) {
            username.setText("");
            password.setText("");
        }
    }//GEN-LAST:event_jButtonResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPage().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent arg0) {
//        String uname = username.getText();
//        String pword = password.getText();
//        
//        if(uname.equals("Juls") & pword.equals("Estorco")){
//            Register rform = new Register();
//            rform.setVisible(true);
//        }
//        else{
//            LogInPage lframe = new LogInPage();
//            JOptionPane.showMessageDialog(lframe, "Invalid Login");
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}