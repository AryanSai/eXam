
package exam;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import java.util.Calendar;
//import java.util.GregorianCalendar;


public class SignIn extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;

    public SignIn() {
        try {
            initComponents();
            con = new DBConnection().DB_Connection();
            teacherId_TF.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        teacherId_TF.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        teacherId_TF = new javax.swing.JTextField();
        password_PF = new javax.swing.JPasswordField();
        login_BTN = new javax.swing.JButton();
        NewTeacherBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        teacherId_TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teacherId_TF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        password_PF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_PF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_PFActionPerformed(evt);
            }
        });

        login_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        login_BTN.setText("Sign In");
        login_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_BTNActionPerformed(evt);
            }
        });
        login_BTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_BTNKeyPressed(evt);
            }
        });

        NewTeacherBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewTeacherBTN.setText("Sign Up");
        NewTeacherBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTeacherBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewTeacherBTN)
                    .addComponent(login_BTN)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teacherId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NewTeacherBTN, login_BTN, password_PF, teacherId_TF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teacherId_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_PF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewTeacherBTN)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {NewTeacherBTN, login_BTN, password_PF, teacherId_TF});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_BTNActionPerformed
        String TeacherID = teacherId_TF.getText();
        String Password = new String(password_PF.getPassword());
        String pass ;
        if (TeacherID.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the details");
        } else {
            try {
                ps = con.prepareStatement("Select * from TeacherRegister where TeacherID =?");
                ps.setString(1, TeacherID);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    pass = rs.getString("password");
                } else {
                    JOptionPane.showMessageDialog(this, "Wrong Id!!!!! Try Again");
                    return;
                }

                if (pass.equals(Password)) {
                    Home br = new Home(TeacherID);
                    br.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Password doesn't match!!!!! Try Again");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_login_BTNActionPerformed

    private void login_BTNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_BTNKeyPressed
    }//GEN-LAST:event_login_BTNKeyPressed

    /* public void curdate() {
    Calendar cal = new GregorianCalendar();
    }*/
    private void password_PFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_PFActionPerformed
        login_BTN.doClick();
    }//GEN-LAST:event_password_PFActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void NewTeacherBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTeacherBTNActionPerformed
        try {
            // TODO add your handling code here:
            SignUp t = new SignUp();
            this.dispose();
            t.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NewTeacherBTNActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewTeacherBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton login_BTN;
    private javax.swing.JPasswordField password_PF;
    private javax.swing.JTextField teacherId_TF;
    // End of variables declaration//GEN-END:variables
}
