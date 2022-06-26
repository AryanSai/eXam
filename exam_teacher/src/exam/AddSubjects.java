package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddSubjects extends javax.swing.JFrame {

    String selectedClass, teacherId, name;

    PreparedStatement ps, ps2;
    ResultSet rclas, rsub;
    DBConnection d = new DBConnection();
    Connection con;

    public AddSubjects(String ID, String name) throws SQLException {
        initComponents();
        con = d.DB_Connection();
        this.name = name;

        teacherId = ID;
        teachersRegistered_CB.addItem(teacherId);
        teachersRegistered_CB.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        teachersRegistered_CB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        class_CB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        subjects_CB = new javax.swing.JComboBox();
        addSubjects_BTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        back_BTN = new javax.swing.JButton();
        nameLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Teachers Registered:");

        teachersRegistered_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teachersRegistered_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Teacher" }));
        teachersRegistered_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersRegistered_CBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Class:");

        class_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        class_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Class" }));
        class_CB.setToolTipText("");
        class_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_CBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Subjects:");

        subjects_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjects_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Subject" }));
        subjects_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjects_CBActionPerformed(evt);
            }
        });

        addSubjects_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addSubjects_BTN.setText("AddSubjects");
        addSubjects_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjects_BTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Add Subjects");

        back_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_BTN.setText("Back");
        back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(80, 80, 80)
                .addComponent(back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teachersRegistered_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(class_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subjects_CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSubjects_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(teachersRegistered_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subjects_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSubjects_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {class_CB, subjects_CB, teachersRegistered_CB});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teachersRegistered_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersRegistered_CBActionPerformed
        class_CB.setEnabled(true);
        subjects_CB.setEnabled(false);
        try {
            ps = con.prepareStatement("Select distinct class from classsubjects");
            rclas = ps.executeQuery();
            while (rclas.next()) {
                String r = rclas.getString("class");
                class_CB.addItem(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_teachersRegistered_CBActionPerformed

    private void class_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_CBActionPerformed
        subjects_CB.setEnabled(true);
        try {
            selectedClass = (String) class_CB.getSelectedItem();
            ps = con.prepareStatement("Select  subject from classsubjects where class=?");
            ps.setString(1, selectedClass);
            rsub = ps.executeQuery();
            subjects_CB.removeAllItems();
            subjects_CB.addItem("Choose Subject");
            while (rsub.next()) {
                String s = rsub.getString("subject");
                subjects_CB.addItem(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_class_CBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nameLBL.setText(name);
        teachersRegistered_CB.setSelectedItem(teacherId);
        teachersRegistered_CB.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void addSubjects_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjects_BTNActionPerformed
        try {
            String ID = (String) teachersRegistered_CB.getSelectedItem();
            String clas = (String) class_CB.getSelectedItem();
            String subject = (String) subjects_CB.getSelectedItem();
            int i;
            ps2 = con.prepareStatement("Insert into teachersubject values(?,?,?)");
            ps2.setString(1, ID);
            ps2.setString(2, clas);
            ps2.setString(3, subject);
            i = ps2.executeUpdate();
            if (i == 1) {
                JOptionPane.showMessageDialog(this, "Successfully Added......");
            }
            class_CB.setSelectedIndex(0);

        } catch (SQLException ex) {
            // Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);

            JOptionPane.showMessageDialog(this, "You've already selected this class & subject!!! ");
        }
    }//GEN-LAST:event_addSubjects_BTNActionPerformed

    private void subjects_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects_CBActionPerformed

    }//GEN-LAST:event_subjects_CBActionPerformed

    private void back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BTNActionPerformed
        try {
            Home mt = new Home(teacherId);
            mt.setVisible(true);
            this.dispose();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddSubjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_back_BTNActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
            ps2.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSubjects_BTN;
    private javax.swing.JButton back_BTN;
    private javax.swing.JComboBox class_CB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JComboBox subjects_CB;
    private javax.swing.JComboBox teachersRegistered_CB;
    // End of variables declaration//GEN-END:variables
}
