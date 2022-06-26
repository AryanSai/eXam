/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home extends javax.swing.JFrame {

    String teacherId, name;
    String[] clas = new String[10];
    PreparedStatement ps;
    DBConnection d = new DBConnection();
    Connection con;

    public Home(String TeacherID) throws SQLException, ClassNotFoundException {
        initComponents();
        ResultSet rs;
        this.teacherId = TeacherID;
        con = d.DB_Connection();

        ps = con.prepareStatement("Select Name from teacherregister where TeacherID=?");
        ps.setString(1, teacherId);
        rs = ps.executeQuery();
        if (rs.next()) {
            name = rs.getString("Name");
        }
        name_LBL.setText(name);
        ps = con.prepareStatement("Select distinct Class from teachersubject where TeacherID=?");
        ps.setString(1, teacherId);
        rs = ps.executeQuery();
        for (int i = 0; rs.next(); i++) {
            clas[i] = rs.getString("Class");
        }
        quetionBank_BTN.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defineQuesPaper_BTN = new javax.swing.JButton();
        LogOutBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quetionBank_BTN = new javax.swing.JButton();
        modifyQP_BTN = new javax.swing.JButton();
        deleteQP_BTN = new javax.swing.JButton();
        modifyQuestions_BTN = new javax.swing.JButton();
        editChapters_BTN = new javax.swing.JButton();
        addSubjects_BTN = new javax.swing.JButton();
        results_BTN = new javax.swing.JButton();
        name_LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        defineQuesPaper_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        defineQuesPaper_BTN.setMnemonic('P');
        defineQuesPaper_BTN.setText("Create Question Paper");
        defineQuesPaper_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defineQuesPaper_BTNActionPerformed(evt);
            }
        });

        LogOutBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogOutBTN.setText("Log Out");
        LogOutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText(" Home");

        quetionBank_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quetionBank_BTN.setMnemonic('A');
        quetionBank_BTN.setText("Question Bank");
        quetionBank_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quetionBank_BTNActionPerformed(evt);
            }
        });

        modifyQP_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modifyQP_BTN.setMnemonic('M');
        modifyQP_BTN.setText("Modify Question Paper");
        modifyQP_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQP_BTNActionPerformed(evt);
            }
        });

        deleteQP_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteQP_BTN.setMnemonic('D');
        deleteQP_BTN.setText("Delete QuestionPaper ");
        deleteQP_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteQP_BTNActionPerformed(evt);
            }
        });

        modifyQuestions_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modifyQuestions_BTN.setMnemonic('Q');
        modifyQuestions_BTN.setText("Modify Question Bank");
        modifyQuestions_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuestions_BTNActionPerformed(evt);
            }
        });

        editChapters_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editChapters_BTN.setMnemonic('C');
        editChapters_BTN.setText("Edit Chapters");
        editChapters_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editChapters_BTNActionPerformed(evt);
            }
        });

        addSubjects_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addSubjects_BTN.setMnemonic('S');
        addSubjects_BTN.setText("Add Subjects");
        addSubjects_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjects_BTNActionPerformed(evt);
            }
        });

        results_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        results_BTN.setMnemonic('R');
        results_BTN.setText("Check Results");
        results_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                results_BTNActionPerformed(evt);
            }
        });

        name_LBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(name_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quetionBank_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifyQuestions_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifyQP_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defineQuesPaper_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editChapters_BTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSubjects_BTN, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(results_BTN)
                            .addComponent(deleteQP_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addSubjects_BTN, defineQuesPaper_BTN, deleteQP_BTN, editChapters_BTN, modifyQP_BTN, modifyQuestions_BTN, quetionBank_BTN, results_BTN});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogOutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(name_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quetionBank_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defineQuesPaper_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyQP_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyQuestions_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editChapters_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(deleteQP_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSubjects_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(results_BTN))
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addSubjects_BTN, defineQuesPaper_BTN, deleteQP_BTN, editChapters_BTN, modifyQP_BTN, modifyQuestions_BTN, quetionBank_BTN, results_BTN});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void defineQuesPaper_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defineQuesPaper_BTNActionPerformed
        try {
            CreateQuestionPaper p = new CreateQuestionPaper(teacherId, clas, name);
            this.dispose();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_defineQuesPaper_BTNActionPerformed

    private void quetionBank_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quetionBank_BTNActionPerformed
        try {
            AddQuestions p = new AddQuestions(teacherId, clas, name);
            this.dispose();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_quetionBank_BTNActionPerformed

    private void LogOutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBTNActionPerformed
        Welcome p = new Welcome();
        this.dispose();
        p.setVisible(true);
    }//GEN-LAST:event_LogOutBTNActionPerformed

    private void modifyQP_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQP_BTNActionPerformed
        try {

            ModifyQuestionPaper m = new ModifyQuestionPaper(teacherId, clas, name);
            this.dispose();
            m.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifyQP_BTNActionPerformed

    private void deleteQP_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteQP_BTNActionPerformed
        DeleteQuestionPaper m = new DeleteQuestionPaper(teacherId, name);
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_deleteQP_BTNActionPerformed

    private void modifyQuestions_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuestions_BTNActionPerformed
        ModifyQuestionBank m = new ModifyQuestionBank(teacherId, clas, name);
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_modifyQuestions_BTNActionPerformed

    private void editChapters_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editChapters_BTNActionPerformed
        EditChapters m = new EditChapters(teacherId, clas, name);
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_editChapters_BTNActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void addSubjects_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjects_BTNActionPerformed
        try {
            AddSubjects a = new AddSubjects(teacherId, name);
            this.dispose();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addSubjects_BTNActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void results_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_results_BTNActionPerformed
        Results a = new Results(teacherId, name);
        this.dispose();
        a.setVisible(true);
    }//GEN-LAST:event_results_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Home(null).setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBTN;
    private javax.swing.JButton addSubjects_BTN;
    private javax.swing.JButton defineQuesPaper_BTN;
    private javax.swing.JButton deleteQP_BTN;
    private javax.swing.JButton editChapters_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyQP_BTN;
    private javax.swing.JButton modifyQuestions_BTN;
    private javax.swing.JLabel name_LBL;
    private javax.swing.JButton quetionBank_BTN;
    private javax.swing.JButton results_BTN;
    // End of variables declaration//GEN-END:variables
}
