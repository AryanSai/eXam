package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XII Info
 */
public class ModifyQuestionPaper extends javax.swing.JFrame {

    String questionPaperId, selectedSubject, selectedClass, teacherID, selectedChapter,name;
    int noOfQuestions, selectedQuestionPaperId;
    
    DefaultTableModel questionTable;
    DefaultListModel listModel, listModel2;
    
    Connection con;
    DBConnection d = new DBConnection();
    PreparedStatement ps;

    public ModifyQuestionPaper(String teacherId, String[] Clas,String name) throws SQLException {
        initComponents();
        con = d.DB_Connection();
        questionTable = (DefaultTableModel) questions_TBL.getModel();
        teacherID = teacherId;
        this.name=name;
        selected_List.setModel(new DefaultListModel());
        deleted_List.setModel(new DefaultListModel());
        listModel = (DefaultListModel) selected_List.getModel();
        listModel2 = (DefaultListModel) deleted_List.getModel();
        try {
            ResultSet rs;
            ps = con.prepareStatement("Select distinct questionPaperId from questionpaperdetails where TeacherID=?");
            ps.setString(1, teacherId);
            rs = ps.executeQuery();
            while (rs.next()) {
                questionPaperId = rs.getString("questionPaperId");
                questionPaperID_CB.addItem(questionPaperId);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModifyQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionPaperIdLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questions_TBL = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        questionPaperID_CB = new javax.swing.JComboBox();
        savePaper_BTN = new javax.swing.JButton();
        back_BTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        noOfQuestions_TF = new javax.swing.JTextField();
        changeNoQns_RB = new javax.swing.JRadioButton();
        changeNoQns_BTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selected_List = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        deleted_List = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
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

        questions_TBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "QuestionID", "Chapter", "Question", "Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(questions_TBL);
        if (questions_TBL.getColumnModel().getColumnCount() > 0) {
            questions_TBL.getColumnModel().getColumn(2).setResizable(false);
            questions_TBL.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Modify Question Paper");

        questionPaperID_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Question Paper ID" }));
        questionPaperID_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionPaperID_CBActionPerformed(evt);
            }
        });

        savePaper_BTN.setText("Save The Paper");
        savePaper_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePaper_BTNActionPerformed(evt);
            }
        });

        back_BTN.setText("Back");
        back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BTNActionPerformed(evt);
            }
        });

        jLabel3.setText("No. Of Questions");

        changeNoQns_RB.setText(" Want to change the no. of questions???");
        changeNoQns_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNoQns_RBActionPerformed(evt);
            }
        });

        changeNoQns_BTN.setText("Change No. of Qns");
        changeNoQns_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNoQns_BTNActionPerformed(evt);
            }
        });

        jLabel5.setText("Selected Chapters");

        selected_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selected_ListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selected_List);

        deleted_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleted_ListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(deleted_List);

        jLabel4.setText("Deleted Chapters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(savePaper_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(379, 379, 379))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(questionPaperID_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuestionPaperIdLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(changeNoQns_RB)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(noOfQuestions_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(changeNoQns_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(397, 397, 397)
                        .addComponent(back_BTN)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(back_BTN)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(changeNoQns_RB)
                                .addComponent(jLabel3)
                                .addComponent(noOfQuestions_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(changeNoQns_BTN)
                                .addComponent(questionPaperID_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(QuestionPaperIdLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savePaper_BTN)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nameLBL.setText(name);
        questionPaperID_CB.requestFocus();
        noOfQuestions_TF.setEditable(false);
        changeNoQns_BTN.setEnabled(false);
        jLabel3.setEnabled(false);
        noOfQuestions_TF.setEnabled(false);
        changeNoQns_BTN.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void questionPaperID_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionPaperID_CBActionPerformed

        if (questionPaperID_CB.getSelectedIndex() > 0) {
            questionTable.setRowCount(0);
            listModel.removeAllElements();
            listModel2.removeAllElements();
            try {
                ResultSet r;
                ps = con.prepareStatement("Select noOfQuestions from QuestionPaperDetails where questionPaperId=?");
                ps.setString(1, questionPaperId);
                r = ps.executeQuery();
                if (r.next()) {
                    noOfQuestions = r.getInt("noOfQuestions");
                    noOfQuestions_TF.setText(Integer.toString(noOfQuestions));
                }

                questionPaperId = (String) questionPaperID_CB.getSelectedItem();
                ps = con.prepareStatement("select class, subject from questionpaperdetails where questionPaperId=?");
                ps.setString(1, questionPaperId);
                ResultSet rss = ps.executeQuery();
                if (rss.next()) {
                    selectedClass = rss.getString("class");
                    selectedSubject = rss.getString("subject");
                }

                ps = con.prepareStatement("select ChapterName,questionPaperId, qp.questionId, qb.questionId,qb.question "
                        + "from questionPaper qp right join questionbank qb "
                        + "on qp.questionId=qb.questionId and questionPaperId=? where class=? and Subject=?");
                ps.setString(1, questionPaperId);
                ps.setString(2, selectedClass);
                ps.setString(3, selectedSubject);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    if (rs.getInt("qp.QuestionID") == rs.getInt("qb.QuestionID")) {
                        questionTable.addRow(new Object[]{
                            rs.getInt("qp.QuestionID"),
                            rs.getString("ChapterName"),
                            rs.getString("qb.Question"), true});
                    } else {
                        questionTable.addRow(new Object[]{
                            rs.getInt("qb.QuestionID"),
                            rs.getString("ChapterName"),
                            rs.getString("qb.Question"), false});
                    }
                }
                
                ResultSet rs2;
                ps = con.prepareStatement("Select ChapterName from classchapters where class=? and subject=? and TeacherID=?");
                ps.setString(1, selectedClass);
                ps.setString(2, selectedSubject);
                ps.setString(3, teacherID);
                rs2 = ps.executeQuery();
                while (rs2.next()) {
                    String Chapter = rs2.getString("ChapterName");
                    listModel.addElement(Chapter);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ModifyQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_questionPaperID_CBActionPerformed

    private void savePaper_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePaper_BTNActionPerformed
        listModel.removeAllElements();

        int questionsInTheTable = questionTable.getRowCount();
        int questionsSelected = 0;
        int i, j, totalmarks;

        try {
            ResultSet r;
            ps = con.prepareStatement("Select noOfQuestions from QuestionPaperDetails where questionPaperId=?");
            ps.setString(1, questionPaperId);
            r = ps.executeQuery();
            if (r.next()) {
                noOfQuestions = r.getInt("noOfQuestions");
            }
            
            PreparedStatement ps2;
            ps2 = con.prepareStatement("delete from Questionpaper where questionPaperId=?");
            ps2.setString(1, questionPaperId);
            ps2.executeUpdate();
            
            for (i = 0, j = 0; i < questionsInTheTable; i++, j++) {
                if (questionTable.getValueAt(i, 3) != null && (boolean) questionTable.getValueAt(i, 3) == true) {
                    questionsSelected++;
                    ps2 = con.prepareStatement("insert into questionpaper values(?,?)");
                    ps2.setString(1, questionPaperId);
                    ps2.setInt(2, (int) questionTable.getValueAt(i, 0));
                    ps2.executeUpdate();
                    continue;
                }
                ps2 = con.prepareStatement("delete from questionpaper where questionPaperId=? and QuestionID=?");
                ps2.setString(1, questionPaperId);
                ps2.setInt(2, (int) questionTable.getValueAt(i, 0));
                ps2.executeUpdate();

            }
            if (questionsSelected < noOfQuestions) {
                JOptionPane.showMessageDialog(this, "No. of questions selected is less than the defined!!!");
            }
            if (questionsSelected >= noOfQuestions) {
                JOptionPane.showMessageDialog(this, "Your Question paper has been saved!!!");
            }
            totalmarks = questionsSelected;
        } catch (SQLException ex) {
            Logger.getLogger(SelectQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_savePaper_BTNActionPerformed

    private void back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BTNActionPerformed
        try {
            Home mt = new Home(teacherID);
            this.setVisible(false);
            mt.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_back_BTNActionPerformed

    private void changeNoQns_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNoQns_RBActionPerformed
        if (changeNoQns_RB.isSelected() == true) {
            noOfQuestions_TF.setEditable(true);
            changeNoQns_BTN.setEnabled(true);
            jLabel3.setEnabled(true);
            noOfQuestions_TF.setEnabled(true);
            savePaper_BTN.setEnabled(false);
        }
        if (changeNoQns_RB.isSelected() == false) {
            noOfQuestions_TF.setEditable(false);
            changeNoQns_BTN.setEnabled(false);
            jLabel3.setEnabled(false);
            noOfQuestions_TF.setEnabled(false);
            savePaper_BTN.setEnabled(true);
        }
    }//GEN-LAST:event_changeNoQns_RBActionPerformed

    private void changeNoQns_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNoQns_BTNActionPerformed
        if (questionPaperID_CB.getSelectedIndex() > 0) {
            questionPaperId = (String) questionPaperID_CB.getSelectedItem();

            try {
                PreparedStatement ps3;
                ps3 = con.prepareStatement("Update QuestionPaperDetails set noOfQuestions=? where questionPaperId=?");
                ps3.setInt(1, Integer.parseInt(noOfQuestions_TF.getText()));
                ps3.setString(2, questionPaperId);
                int i = ps3.executeUpdate();
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "No.of questions has been modified  !!!");
                    savePaper_BTN.setEnabled(true);
                    noOfQuestions_TF.setEditable(false);
                    changeNoQns_BTN.setEnabled(false);
                    jLabel3.setEnabled(false);
                    noOfQuestions_TF.setEnabled(false);
                    changeNoQns_RB.setSelected(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ModifyQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeNoQns_BTNActionPerformed

    private void selected_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selected_ListMouseClicked
        String chapterClicked = (String) selected_List.getSelectedValue();
        int isConfirm = JOptionPane.showConfirmDialog(this, "Delete questions from " + chapterClicked + "?");
        if (isConfirm == JOptionPane.OK_OPTION) {
            int rowsInTable = questions_TBL.getRowCount();
            for (int i = 0; i < rowsInTable; i++) {
                if (chapterClicked.equals(questionTable.getValueAt(i, 1))) {
                    questionTable.removeRow(i);
                    rowsInTable--;
                    i--;
                }
            }
            listModel2.addElement(chapterClicked);
            listModel.removeElement(chapterClicked);
        }
    }//GEN-LAST:event_selected_ListMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void deleted_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleted_ListMouseClicked
        String chapterClicked = (String) deleted_List.getSelectedValue();
        int isConfirm = JOptionPane.showConfirmDialog(this, "Select questions from " + chapterClicked + "?");
        if (isConfirm == JOptionPane.OK_OPTION) {
            listModel2.removeElement(chapterClicked);
            listModel.addElement(chapterClicked);
            try {
                ResultSet r;
                ps = con.prepareStatement("select Question,QuestionID,ChapterName from questionbank where ChapterName='" + chapterClicked + "' and Class='" + selectedClass + "'and Subject='" + selectedSubject + "'");
                r = ps.executeQuery();
                while (r.next()) {
                    questionTable.addRow(new Object[]{
                        r.getInt("QuestionID"),
                        r.getString("ChapterName"),
                        r.getString("Question"), false
                    });
                }
            } catch (SQLException ex) {
                Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleted_ListMouseClicked

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
            java.util.logging.Logger.getLogger(ModifyQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyQuestionPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QuestionPaperIdLBL;
    private javax.swing.JButton back_BTN;
    private javax.swing.JButton changeNoQns_BTN;
    private javax.swing.JRadioButton changeNoQns_RB;
    private javax.swing.JList deleted_List;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField noOfQuestions_TF;
    private javax.swing.JComboBox questionPaperID_CB;
    private javax.swing.JTable questions_TBL;
    private javax.swing.JButton savePaper_BTN;
    private javax.swing.JList selected_List;
    // End of variables declaration//GEN-END:variables
}
