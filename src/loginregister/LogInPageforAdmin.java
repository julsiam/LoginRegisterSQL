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

public class LogInPageforAdmin extends javax.swing.JFrame {

    public LogInPageforAdmin() {
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
        adminusername = new javax.swing.JTextField();
        adminpassword = new javax.swing.JPasswordField();
        adminLogInbtn = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jCheckBoxshowpass = new javax.swing.JCheckBox();
        jButtonReset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 250));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, -1, -1));

        jLabel2.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 204, -1, -1));

        adminusername.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        adminusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        adminusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminusernameFocusLost(evt);
            }
        });
        jPanel1.add(adminusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 125, 206, 33));

        adminpassword.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        adminpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        adminpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adminpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminpasswordFocusLost(evt);
            }
        });
        jPanel1.add(adminpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 192, 206, 33));

        adminLogInbtn.setBackground(new java.awt.Color(153, 153, 153));
        adminLogInbtn.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        adminLogInbtn.setText("Log In");
        adminLogInbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 5));
        adminLogInbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLogInbtnMouseClicked(evt);
            }
        });
        adminLogInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogInbtnActionPerformed(evt);
            }
        });
        jPanel1.add(adminLogInbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 336, 116, -1));

        jButtonRegister.setBackground(new java.awt.Color(153, 153, 153));
        jButtonRegister.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 336, 112, -1));

        jCheckBoxshowpass.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jCheckBoxshowpass.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxshowpass.setText("Show Password");
        jCheckBoxshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxshowpassActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBoxshowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 243, -1, -1));

        jButtonReset.setBackground(new java.awt.Color(153, 153, 153));
        jButtonReset.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 3));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 296, 85, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Welcome to Jul's Agri-Supply");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, 50));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\1styrGroupB\\Pictures\\Saved Pictures\\loginback (2).png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 410, 350));

        jLabel7.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin Verification");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void adminLogInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogInbtnActionPerformed
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
    }//GEN-LAST:event_adminLogInbtnActionPerformed

    private void adminLogInbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLogInbtnMouseClicked
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

        String uname = adminusername.getText();
        String pass = String.valueOf(adminpassword.getPassword());

        if ("@admin".equals(this.adminusername.getText()) && "estorco@123".equals(this.adminpassword.getText())) {
            new AdminManagement().setVisible(true);
            this.setVisible(false);
        } else {

            try {

                Class.forName("com.mysql.jdbc.Driver");

                try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_management_system", "root", "")) {

                    Statement stmt = con.createStatement();

                    String query1 = "SELECT * FROM customers_info WHERE username = '" + uname + "' and password = '" + pass + "'";

                    ResultSet rs = stmt.executeQuery(query1);

                    if (rs.next()) {
                        dispose();//close login page

                        new LandingPage().setVisible(true);

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
        }
    }//GEN-LAST:event_adminLogInbtnMouseClicked

    private void adminusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminusernameFocusGained
        if (adminusername.getText().trim().toLowerCase().equals("username")) {
            adminusername.setText("");
        }

    }//GEN-LAST:event_adminusernameFocusGained

    private void adminusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminusernameFocusLost
        // if the text field is equal to username or empty
        // we will set the "username" text in the field 
        // on focus lost event

        if (adminusername.getText().trim().equals("")
                || adminusername.getText().trim().toLowerCase().equals("username")) {
            adminusername.setText("username");
        }
    }//GEN-LAST:event_adminusernameFocusLost

    private void adminpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminpasswordFocusGained
        // clear the password field on focus if the text is "password"

        // get the password text
        String pass = String.valueOf(adminpassword.getPassword());

        if (pass.trim().toLowerCase().equals("password")) {
            adminpassword.setText("");
        }
    }//GEN-LAST:event_adminpasswordFocusGained

    private void adminpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminpasswordFocusLost
        // if the password field is equal to password or empty
        // we will set the "password" text in the field 
        // on focus lost event

        // get the password text
        String pass = String.valueOf(adminpassword.getPassword());

        if (pass.trim().equals("")
                || pass.trim().toLowerCase().equals("password")) {
            adminpassword.setText("password");
        }
    }//GEN-LAST:event_adminpasswordFocusLost

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
                adminpassword.setEchoChar((char) 0);
            } else {
                adminpassword.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_jCheckBoxshowpassActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        if (evt.getSource() == jButtonReset) {
            adminusername.setText("");
            adminpassword.setText("");
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
            java.util.logging.Logger.getLogger(LogInPageforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInPageforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInPageforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInPageforAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInPageforAdmin().setVisible(true);
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
    private javax.swing.JButton adminLogInbtn;
    private javax.swing.JPasswordField adminpassword;
    private javax.swing.JTextField adminusername;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}