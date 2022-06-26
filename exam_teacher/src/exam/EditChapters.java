package exam;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditChapters extends javax.swing.JFrame {

    String teacherId, selectedSubject, selectedClass;

    DBConnection d = new DBConnection();
    Connection con;
    PreparedStatement ps, ps2, ps1, ps3;
    String name;
    String[] clas = new String[5];

    public EditChapters(String teacherId, String[] clas, String name) {

        try {
            initComponents();
            this.teacherId = teacherId;
            this.name = name;
            this.clas = clas;
            con = d.DB_Connection();
            class_CB.addItem("Choose Class");
            for (String i : clas) {
                if (i == null) {
                    break;
                }
                class_CB.addItem(i);
            }
            class_CB.requestFocus();

        } catch (SQLException ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_BTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        class_CB = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        subject_CB = new javax.swing.JComboBox();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        rename_TF = new javax.swing.JTextField();
        r = new javax.swing.JLabel();
        rename_BTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        chaptersAdded_CB1 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        chaptersAdded_CB = new javax.swing.JComboBox();
        deleteChapter_BTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chapterName_TF = new javax.swing.JTextField();
        addChapter_BTN = new javax.swing.JButton();
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

        back_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_BTN.setText("Back");
        back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BTNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Edit Chapters");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("CLASS");

        class_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        class_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_CBActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("SUBJECT");

        subject_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subject_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_CBActionPerformed(evt);
            }
        });

        r.setText("Rename Chapter");

        rename_BTN.setMnemonic('N');
        rename_BTN.setText("Rename Chapter");
        rename_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rename_BTNActionPerformed(evt);
            }
        });

        jLabel4.setText("Chapters Added");

        chaptersAdded_CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chaptersAdded_CB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(r))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chaptersAdded_CB1, 0, 155, Short.MAX_VALUE)
                            .addComponent(rename_TF)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(rename_BTN)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaptersAdded_CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r)
                    .addComponent(rename_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(rename_BTN)
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("Rename Chapter", jPanel5);

        jLabel3.setText("Chapters Added");

        deleteChapter_BTN.setMnemonic('d');
        deleteChapter_BTN.setText("Delete");
        deleteChapter_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteChapter_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chaptersAdded_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(deleteChapter_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chaptersAdded_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(deleteChapter_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        jTabbedPane2.addTab("Delete Chapter", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CHAPTER NAME");

        chapterName_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chapterName_TFActionPerformed(evt);
            }
        });

        addChapter_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addChapter_BTN.setMnemonic('a');
        addChapter_BTN.setText("Add Chapter");
        addChapter_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addChapter_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(chapterName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(addChapter_BTN)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chapterName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(addChapter_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addChapter_BTN, chapterName_TF});

        jTabbedPane2.addTab("Add Chapter", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_BTN)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(subject_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subject_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addChapter_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addChapter_BTNActionPerformed
        if (subject_CB.getSelectedIndex() > 0 && class_CB.getSelectedIndex() > 0) {
            selectedSubject = (String) subject_CB.getSelectedItem();
            String chaptername = chapterName_TF.getText();
            int i = 0;
            try {
                ps2 = con.prepareStatement("insert into classchapters values(?,?,?,lcase(?))");
                ps2.setString(1, teacherId);
                ps2.setString(2, selectedClass);
                ps2.setString(3, selectedSubject);
                ps2.setString(4, chaptername);
                i = ps2.executeUpdate();
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "New Chapter has been added Successfully");
                    chapterName_TF.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "Chaptername already exists!!!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
            }
            subject_CB.actionPerformed(evt);
        } else {
            JOptionPane.showMessageDialog(this, "Please select the class and subject!!!");
        }
    }//GEN-LAST:event_addChapter_BTNActionPerformed

    private void back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BTNActionPerformed
        try {
            if (class_CB.getItemCount() != 1) {
                Home m = new Home(teacherId);
                this.dispose();
                m.setVisible(true);
            } else {
                AddQuestions qb = new AddQuestions(teacherId, clas,name);
                this.dispose();
                qb.setVisible(true);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_back_BTNActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void subject_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_CBActionPerformed
        try {
            chaptersAdded_CB.removeAllItems();
            chaptersAdded_CB.addItem("Choose Chapter");
            chaptersAdded_CB1.removeAllItems();
            chaptersAdded_CB1.addItem("Choose Chapter");
            ps1 = con.prepareStatement("SELECT * FROM classchapters where TeacherId=? and class=? and subject=?");
            ps1.setString(1, teacherId);
            ps1.setString(2, (String) class_CB.getSelectedItem());
            ps1.setString(3, (String) subject_CB.getSelectedItem());
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                chaptersAdded_CB.addItem(rs.getString("chaptername"));
                chaptersAdded_CB1.addItem(rs.getString("chaptername"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subject_CBActionPerformed
    private void class_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_CBActionPerformed
        subject_CB.removeAllItems();
        subject_CB.addItem("Choose Subject");
        try {
            selectedClass = (String) class_CB.getSelectedItem();
            ps = con.prepareStatement("Select distinct subject from teachersubject where TeacherID=? and Class=?");
            ps.setString(1, teacherId);
            ps.setString(2, selectedClass);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                subject_CB.addItem(rs.getString("subject"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_class_CBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nameLBL.setText(name);
    }//GEN-LAST:event_formWindowOpened

    private void deleteChapter_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteChapter_BTNActionPerformed
        if (subject_CB.getSelectedIndex() > 0 && class_CB.getSelectedIndex() > 0) {
            try {
                con.setAutoCommit(false);
                String chaptername = (String) chaptersAdded_CB.getSelectedItem();
                ps = con.prepareStatement("delete from classchapters where chaptername=? and class=? and subject=?");
                ps.setString(1, chaptername);
                ps.setString(2, (String) class_CB.getSelectedItem());
                ps.setString(3, (String) subject_CB.getSelectedItem());
                int i = ps.executeUpdate();

                int count = 0;
                ps = con.prepareStatement("select count(*) from questionBank where chaptername=? and class=? and subject=?");
                ps.setString(1, chaptername);
                ps.setString(2, (String) class_CB.getSelectedItem());
                ps.setString(3, (String) subject_CB.getSelectedItem());
                ResultSet rs2 = ps.executeQuery();
                if (rs2.next()) {
                    count = rs2.getInt("count(*)");
                }

                ps = con.prepareStatement("delete from  questionBank  where chaptername=? and class=? and subject=?");
                ps.setString(1, chaptername);
                ps.setString(2, (String) class_CB.getSelectedItem());
                ps.setString(3, (String) subject_CB.getSelectedItem());
                i += ps.executeUpdate();

                if (i == (count + 1)) {
                    con.commit();
                    JOptionPane.showMessageDialog(this, "Chapter has been deleted successfully!!!");
                    chaptersAdded_CB.removeItem(chaptername);

                } else {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Error updating. Try Again.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select the class and subject!!!");
        }
        subject_CB.actionPerformed(evt);
    }//GEN-LAST:event_deleteChapter_BTNActionPerformed

    private void chapterName_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chapterName_TFActionPerformed
        addChapter_BTN.doClick();
    }//GEN-LAST:event_chapterName_TFActionPerformed

    private void rename_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rename_BTNActionPerformed
        if (subject_CB.getSelectedIndex() > 0 && class_CB.getSelectedIndex() > 0) {
            try {
                con.setAutoCommit(false);
                String existing_name = (String) chaptersAdded_CB1.getSelectedItem();
                String new_name = rename_TF.getText();
                ps = con.prepareStatement("update classchapters set chaptername=? where chaptername=? and class=? and subject=? ");
                ps.setString(1, new_name);
                ps.setString(2, existing_name);
                ps.setString(3, (String) class_CB.getSelectedItem());
                ps.setString(4, (String) subject_CB.getSelectedItem());
                int i = ps.executeUpdate();

                int count = 0;
                ps = con.prepareStatement("select count(*) from questionBank where chaptername=? and class=? and subject=?");
                ps.setString(1, existing_name);
                ps.setString(2, (String) class_CB.getSelectedItem());
                ps.setString(3, (String) subject_CB.getSelectedItem());
                ResultSet rs2 = ps.executeQuery();
                if (rs2.next()) {
                    count = rs2.getInt("count(*)");
                }

                ps = con.prepareStatement("update questionBank set chaptername=? where chaptername=? and class=? and subject=?");
                ps.setString(1, new_name);
                ps.setString(2, existing_name);
                ps.setString(3, (String) class_CB.getSelectedItem());
                ps.setString(4, (String) subject_CB.getSelectedItem());
                i += ps.executeUpdate();

                if (i == (count + 1)) {
                    con.commit();
                    JOptionPane.showMessageDialog(this, "Chapter has been renamed successfully!!!");
                    chaptersAdded_CB1.removeItem(existing_name);
                    chaptersAdded_CB1.addItem(new_name);
                    rename_TF.setText(null);
                } else {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Error updating. Try Again.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select the class and subject!!!");
        }
    }//GEN-LAST:event_rename_BTNActionPerformed

    private void chaptersAdded_CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chaptersAdded_CB1ActionPerformed

    }//GEN-LAST:event_chaptersAdded_CB1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditChapters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditChapters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditChapters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditChapters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addChapter_BTN;
    private javax.swing.JButton back_BTN;
    private javax.swing.JTextField chapterName_TF;
    private javax.swing.JComboBox chaptersAdded_CB;
    private javax.swing.JComboBox chaptersAdded_CB1;
    private javax.swing.JComboBox class_CB;
    private javax.swing.JButton deleteChapter_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JLabel r;
    private javax.swing.JButton rename_BTN;
    private javax.swing.JTextField rename_TF;
    private javax.swing.JComboBox subject_CB;
    // End of variables declaration//GEN-END:variables
}
