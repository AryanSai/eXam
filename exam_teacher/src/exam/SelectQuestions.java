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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XII Info
 */
public class SelectQuestions extends javax.swing.JFrame {

    String questionPaperId, selectedSubject, selectedClass, selectedChapter, teacherId, name;
    int noOfQuestions, j, questionsSelected;
    String[] chapterNames, clas = new String[12];
    DefaultTableModel tableModel;
    DefaultListModel listModel;
    ResultSet r;
    DBConnection d = new DBConnection();
    Connection con;
    PreparedStatement ps, ps2;

    public SelectQuestions(String TeacherId, String selectedsubject, String selectedclass, String QuestionPaperId, int noOfQuestions, String[] clas, String name) {
        this.selectedClass = selectedclass;
        this.selectedSubject = selectedsubject;
        this.teacherId = TeacherId;
        this.questionPaperId = QuestionPaperId;
        this.noOfQuestions = noOfQuestions;
        this.clas = clas;
        this.name = name;

        initComponents();

        try {
            questionsSelected = 0;
            con = d.DB_Connection();
            ps = con.prepareStatement("select chaptername from classchapters where teacherId=? and class=? and subject=?");
            ps.setString(1, teacherId);
            ps.setString(2, selectedClass);
            ps.setString(3, selectedSubject);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chapterNames_CB.addItem(rs.getString("chaptername"));
            }

            tableModel = (DefaultTableModel) questions_TBL.getModel();
            selected_list.setModel(new DefaultListModel());
            listModel = (DefaultListModel) selected_list.getModel();

            noQns_TF.setText(Integer.toString(noOfQuestions));

        } catch (SQLException ex) {
            Logger.getLogger(SelectQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
        chapterNames_CB.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        questions_TBL = new javax.swing.JTable();
        chapterNames_CB = new javax.swing.JComboBox();
        clearTable_BTN = new javax.swing.JButton();
        saveQuestions_BTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back_BTN = new javax.swing.JButton();
        QuestionPaperIdLBL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        questionPaperId_TF = new javax.swing.JTextField();
        class_TF = new javax.swing.JTextField();
        subject_TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selected_list = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        noQns_TF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameLBL = new javax.swing.JLabel();
        nameLBL1 = new javax.swing.JLabel();
        name_LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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
            questions_TBL.getColumnModel().getColumn(0).setResizable(false);
            questions_TBL.getColumnModel().getColumn(1).setResizable(false);
            questions_TBL.getColumnModel().getColumn(2).setResizable(false);
            questions_TBL.getColumnModel().getColumn(3).setResizable(false);
        }

        chapterNames_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chapterNames_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chapter Name" }));
        chapterNames_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chapterNames_CBActionPerformed(evt);
            }
        });

        clearTable_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearTable_BTN.setText("Clear Table");
        clearTable_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTable_BTNActionPerformed(evt);
            }
        });

        saveQuestions_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveQuestions_BTN.setText("Save The Paper");
        saveQuestions_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveQuestions_BTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Select Questions for your QuestionPaper");

        back_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_BTN.setText("Back");
        back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BTNActionPerformed(evt);
            }
        });

        QuestionPaperIdLBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuestionPaperIdLBL.setText("Q.Paper.ID");

        questionPaperId_TF.setEditable(false);
        questionPaperId_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        class_TF.setEditable(false);
        class_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        subject_TF.setEditable(false);
        subject_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Subject");

        selected_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selected_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selected_list);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Selected Chapters");

        noQns_TF.setEditable(false);
        noQns_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noQns_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noQns_TFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("No.of Qns");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Add Questions from this chapter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(name_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_BTN)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clearTable_BTN)
                                .addGap(28, 28, 28)
                                .addComponent(saveQuestions_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(QuestionPaperIdLBL)
                        .addGap(55, 55, 55)
                        .addComponent(questionPaperId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noQns_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(class_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subject_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(chapterNames_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(662, Short.MAX_VALUE)
                    .addComponent(nameLBL)
                    .addContainerGap(662, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(499, Short.MAX_VALUE)
                    .addComponent(nameLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(662, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(name_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 230, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(noQns_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(class_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(subject_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chapterNames_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(questionPaperId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QuestionPaperIdLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearTable_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveQuestions_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(299, Short.MAX_VALUE)
                    .addComponent(nameLBL)
                    .addContainerGap(300, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(299, Short.MAX_VALUE)
                    .addComponent(nameLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        name_LBL.setText(name);
        questionPaperId_TF.setText(questionPaperId);
        class_TF.setText(selectedClass);
        subject_TF.setText(selectedSubject);
    }//GEN-LAST:event_formWindowOpened

    private void chapterNames_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chapterNames_CBActionPerformed

        selectedChapter = (String) chapterNames_CB.getSelectedItem();
        if (chapterNames_CB.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Please select any chapter!!!!");
        } else {
            try {
                ResultSet rs;
                ps = con.prepareStatement("select ChapterName,Question,QuestionID from questionbank where ChapterName='" + selectedChapter + "' and Class='" + selectedClass + "'and Subject='" + selectedSubject + "'");
                rs = ps.executeQuery();
                while (rs.next()) {
                    tableModel.addRow(new Object[]{
                        rs.getInt("QuestionID"),
                        rs.getString("ChapterName"),
                        rs.getString("Question"),
                        false
                    });
                }
            } catch (SQLException ex) {

            }
            chapterNames_CB.removeItem(selectedChapter);
            listModel.addElement(selectedChapter);
        }
    }//GEN-LAST:event_chapterNames_CBActionPerformed

    private void clearTable_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTable_BTNActionPerformed
        tableModel.setRowCount(0);
    }//GEN-LAST:event_clearTable_BTNActionPerformed

    private void saveQuestions_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveQuestions_BTNActionPerformed

        int questionsInTheTable = tableModel.getRowCount();
        int i;
        try {
            ResultSet r;
            ps = con.prepareStatement("Select QuestionID from questionpaper where questionPaperId=?");
            ps.setString(1, questionPaperId);
            r = ps.executeQuery();

            for (i = 0, j = 0; i < questionsInTheTable; i++, j++) {
                if (tableModel.getValueAt(i, 3) != null && (boolean) tableModel.getValueAt(i, 3) == true) {
                    questionsSelected++;

                    ps2 = con.prepareStatement("insert into questionpaper values(?,?)");
                    ps2.setString(1, questionPaperId);
                    ps2.setInt(2, (int) tableModel.getValueAt(i, 0));
                    ps2.executeUpdate();
                    continue;
                }
                ps2 = con.prepareStatement("delete from questionpaper where questionPaperId=? and QuestionID=?");
                ps2.setString(1, questionPaperId);
                ps2.setInt(2, (int) tableModel.getValueAt(i, 0));
                ps2.executeUpdate();

            }
            if (questionsSelected < noOfQuestions) {
                JOptionPane.showMessageDialog(this, "You've saved less no. of questions \n Resume your work in Modification Module!!!");
                saveMarks();
            } else if (questionsSelected >= noOfQuestions) {
                JOptionPane.showMessageDialog(this, "Question Paper has been saved!!!");
                saveMarks();
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveQuestions_BTNActionPerformed

    public void saveMarks() {
        try {
            try {
                Home m;
                m = new Home(teacherId);
                this.dispose();
                m.setVisible(true);

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SelectQuestions.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SelectQuestions.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void selected_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selected_listMouseClicked
        // if (ChapterNamesCB.getSelectedIndex() > 0) {
        String chapterClicked = (String) selected_list.getSelectedValue();
        int isConfirm = JOptionPane.showConfirmDialog(this, "Delete questions from " + chapterClicked + "?");
        if (isConfirm == JOptionPane.OK_OPTION) {
            int rowsInTable = questions_TBL.getRowCount();
            chapterNames_CB.addItem(chapterClicked);
            listModel.removeElement(chapterClicked);
            for (int i = 0; i < rowsInTable; i++) {
                if (chapterClicked.equals(tableModel.getValueAt(i, 1))) {
                    tableModel.removeRow(i);
                    rowsInTable--;
                    i--;
                }
            }
        }
    }//GEN-LAST:event_selected_listMouseClicked

    private void noQns_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noQns_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noQns_TFActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
            ps2.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BTNActionPerformed
        int r = JOptionPane.showConfirmDialog(this, "Going back will discard unsaved work!! \n"
                + "Are you sure to go back?");
        if (r == JOptionPane.OK_OPTION) {
            try {
                Home m = new Home(teacherId);
                this.setVisible(false);
                m.setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SelectQuestions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_back_BTNActionPerformed

    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel QuestionPaperIdLBL;
    private javax.swing.JButton back_BTN;
    private javax.swing.JComboBox chapterNames_CB;
    private javax.swing.JTextField class_TF;
    private javax.swing.JButton clearTable_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JLabel nameLBL1;
    private javax.swing.JLabel name_LBL;
    private javax.swing.JTextField noQns_TF;
    private javax.swing.JTextField questionPaperId_TF;
    private javax.swing.JTable questions_TBL;
    private javax.swing.JButton saveQuestions_BTN;
    private javax.swing.JList selected_list;
    private javax.swing.JTextField subject_TF;
    // End of variables declaration//GEN-END:variables

    private static class MainFrame_teacher {

        public MainFrame_teacher(String ID) {
        }
    }
}
