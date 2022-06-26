/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author NGS
 */
public class AddQuestions extends javax.swing.JFrame {

    /**
     * Creates new form QuestionBank
     */
    int questionNo = 0, mark = 1;
    String selectedSubject, selectedClass, chapterName, teacherID, imagePath,name;
    
    DBConnection d = new DBConnection();
    Connection con;
    PreparedStatement ps, ps2;
    
    InputStream input = null;
    ImageIcon ic, fin_img;
    JFileChooser chooser;
    int result;
    File selectedImage;
 
    String[] clas;
    
    public AddQuestions(String teacherID, String[] Clas,String name) throws SQLException {
        this.clas = Clas;
        this.teacherID = teacherID;
        this.name = name;
        initComponents();
        con = d.DB_Connection();
        class_CB.addItem("Choose Class");
        for (String cls : Clas) {
            if (cls == null) {
                break;
            }
            class_CB.addItem(cls);

        }
class_CB.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        slNo_TF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        question_TF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        optionA_TF = new javax.swing.JTextField();
        optionB_TF = new javax.swing.JTextField();
        optionC_TF = new javax.swing.JTextField();
        optionD_TF = new javax.swing.JTextField();
        message_LBL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addQuestion_BTN = new javax.swing.JButton();
        answerOption_CB = new javax.swing.JComboBox<String>();
        class_CB = new javax.swing.JComboBox();
        subject_CB = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chapter_CB = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        addNewChapter_BTN = new javax.swing.JButton();
        back_BTN = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        importImage_BTN = new javax.swing.JButton();
        picture_LBL = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Add Questions");

        slNo_TF.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("SL.NO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("QUESTION :");

        question_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question_TFActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("OPTIONS:");

        message_LBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("A");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("B");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("C");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("D");

        addQuestion_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addQuestion_BTN.setText("ADD");
        addQuestion_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestion_BTNActionPerformed(evt);
            }
        });

        answerOption_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        answerOption_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Answer", "A", "B", "C", "D" }));
        answerOption_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerOption_CBActionPerformed(evt);
            }
        });

        class_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        class_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_CBActionPerformed(evt);
            }
        });

        subject_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subject_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_CBActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("SUBJECT");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("CLASS");

        chapter_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chapter_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chapter_CBActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("ChapterName");

        addNewChapter_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addNewChapter_BTN.setText("Add New Chapter");
        addNewChapter_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewChapter_BTNActionPerformed(evt);
            }
        });

        back_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back_BTN.setText("Back");
        back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BTNActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ANSWER:");

        importImage_BTN.setText("Import Image");
        importImage_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importImage_BTNActionPerformed(evt);
            }
        });

        picture_LBL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slNo_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(picture_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(importImage_BTN)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(question_TF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(optionC_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(optionA_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(answerOption_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(optionB_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                            .addComponent(optionD_TF)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(message_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addQuestion_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subject_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chapter_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(addNewChapter_BTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(359, 359, 359)
                        .addComponent(back_BTN)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {optionA_TF, optionB_TF, optionC_TF, optionD_TF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subject_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chapter_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNewChapter_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slNo_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(question_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(optionA_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(optionC_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(optionB_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(optionD_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(answerOption_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(picture_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addQuestion_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(importImage_BTN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(message_LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {optionA_TF, optionB_TF, optionC_TF, optionD_TF});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void question_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question_TFActionPerformed

    private void addQuestion_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestion_BTNActionPerformed
        if (class_CB.getSelectedIndex() > 0 && subject_CB.getSelectedIndex() > 0 && chapter_CB.getSelectedIndex() > 0) {
            String question = question_TF.getText();
            String optionA = optionA_TF.getText();
            String optionB = optionB_TF.getText();
            String optionC = optionC_TF.getText();
            String optionD = optionD_TF.getText();
            String answerOption = (String) answerOption_CB.getSelectedItem();
            if (question.isEmpty()
                    || optionA.isEmpty()
                    || optionB.isEmpty()
                    || optionC.isEmpty()
                    || optionD.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Don't leave any Field empty !!!!!");
                return;
            }
            if (answerOption_CB.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Please select the answer");
                return;
            }

            try {
                chapterName = (String) chapter_CB.getSelectedItem();
                ps = con.prepareStatement("insert into questionBank(Class, Subject, "
                        + "chapterName, questionNo, question, optionA, optionB, optionC,optionD, "
                        + "answerOption, mark,Image) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?) ");
                ps.setString(1, selectedClass);
                ps.setString(2, selectedSubject);
                ps.setString(3, chapterName);
                ps.setInt(4, questionNo);
                ps.setString(5, question);
                ps.setString(6, optionA);
                ps.setString(7, optionB);
                ps.setString(8, optionC);
                ps.setString(9, optionD);
                ps.setString(10, answerOption);
                ps.setInt(11, mark);
                ps.setBlob(12, input);

                if (ps.executeUpdate() == 1) {
                    questionNo += 1;
                    slNo_TF.setText(Integer.toString(questionNo));
                    message_LBL.setText("question No " + (questionNo - 1) + " added");
                    message_LBL.setForeground(Color.blue);
                }
            } catch (SQLException ex) {
                message_LBL.setText("question No " + (questionNo - 1) + " couldn't be added");
                message_LBL.setForeground(Color.red);
                Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
            }
            clearWindow();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill the fields to proceed...");
        }
    }//GEN-LAST:event_addQuestion_BTNActionPerformed

    public void clearWindow() {
        question_TF.setText(null);
        optionA_TF.setText(null);
        optionB_TF.setText(null);
        optionC_TF.setText(null);
        optionD_TF.setText(null);
        question_TF.requestFocus();
        answerOption_CB.setSelectedIndex(0);
        picture_LBL.setIcon(null);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        class_CB.requestFocus();
        addNewChapter_BTN.setEnabled(false);
        chapter_CB.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void class_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_CBActionPerformed
        subject_CB.removeAllItems();
        nameLBL.setText(name);
        subject_CB.addItem("Choose Subject");
        try {
            selectedClass = (String) class_CB.getSelectedItem();
            ps = con.prepareStatement("Select distinct subject from teachersubject where teacherID=? and Class=?");
            ps.setString(1, teacherID);
            ps.setString(2, selectedClass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                subject_CB.addItem(rs.getString("subject"));
            }
            message_LBL.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_class_CBActionPerformed

    private void subject_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_CBActionPerformed
        chapter_CB.removeAllItems();
        chapter_CB.addItem("Choose Chapter");
        if (subject_CB.getSelectedIndex() == 0) {
            return;
        }
        try {
            if (class_CB.getSelectedIndex() > 0 && subject_CB.getSelectedIndex() > 0) {
                addNewChapter_BTN.setEnabled(true);
                chapter_CB.setEnabled(true);
            }
            selectedSubject = (String) subject_CB.getSelectedItem();
            ps = con.prepareStatement("Select chapterName from classchapters where class=? and subject=?");
            ps.setString(1, selectedClass);
            ps.setString(2, selectedSubject);
            ResultSet rs = ps.executeQuery();

            for (int i = 0; rs.next(); i++) {
                chapter_CB.addItem(rs.getString("chapterName"));
                message_LBL.setText(null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subject_CBActionPerformed

    private void chapter_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chapter_CBActionPerformed

        questionNo = 0;
        try {
            String selectedchapter = (String) chapter_CB.getSelectedItem();
            ps = con.prepareStatement("select max(questionNo) questionNo from questionbank where Class=? and Subject=? and chapterName=?");
            ps.setString(1, selectedClass);
            ps.setString(2, selectedSubject);
            ps.setString(3, selectedchapter);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                questionNo = rs.getInt("questionNo");
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddQuestions.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            questionNo += 1;
            slNo_TF.setText(Integer.toString(questionNo));
        }
    }//GEN-LAST:event_chapter_CBActionPerformed

    private void addNewChapter_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewChapter_BTNActionPerformed
        if (class_CB.getSelectedIndex() > 0 && subject_CB.getSelectedIndex() > 0) {
            selectedClass = (String) class_CB.getSelectedItem();
            selectedSubject = (String) subject_CB.getSelectedItem();
            String newChapterName = null;
            newChapterName = (String) JOptionPane.showInputDialog(newChapterName);

            if (newChapterName != null) {

                try {
                    ps2 = con.prepareStatement("insert into classchapters values(?,?,?,lcase(?))");
                    ps2.setString(1, teacherID);
                    ps2.setString(2, selectedClass);
                    ps2.setString(3, selectedSubject);
                    ps2.setString(4, newChapterName);
                    if (ps2.executeUpdate() == 1) {
                        JOptionPane.showMessageDialog(this, "New chapter has been added!!!");
                        chapter_CB.addItem(newChapterName);
                        chapter_CB.setSelectedItem(newChapterName);
                    } else {
                        JOptionPane.showMessageDialog(this, "ChapterName already exists");

                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "ChapterName already exists");

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Choose the class and subject");
        }
    }//GEN-LAST:event_addNewChapter_BTNActionPerformed

    private void answerOption_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerOption_CBActionPerformed
//        NextBTN.doClick();
    }//GEN-LAST:event_answerOption_CBActionPerformed

    private void back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BTNActionPerformed
        try {
            Home l = new Home(teacherID);
            this.dispose();
            l.setVisible(true);

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddQuestions.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_back_BTNActionPerformed

    private void importImage_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importImage_BTNActionPerformed
        chooser = new JFileChooser();
        result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            try {
                selectedImage = chooser.getSelectedFile();
                imagePath = selectedImage.getAbsolutePath();
                ic = new ImageIcon(imagePath);
                Image img = ic.getImage();
                Image sized_img = img.getScaledInstance(picture_LBL.getWidth(), picture_LBL.getHeight(), Image.SCALE_SMOOTH);
                fin_img = new ImageIcon(sized_img);
                picture_LBL.setIcon(fin_img);
                input = new FileInputStream(imagePath);

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Try Again!!");
            }
        }
    }//GEN-LAST:event_importImage_BTNActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
            
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
            java.util.logging.Logger.getLogger(AddQuestions.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestions.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestions.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestions.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton addNewChapter_BTN;
    private javax.swing.JButton addQuestion_BTN;
    private javax.swing.JComboBox<String> answerOption_CB;
    private javax.swing.JButton back_BTN;
    private javax.swing.JComboBox chapter_CB;
    private javax.swing.JComboBox class_CB;
    private javax.swing.JButton importImage_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel message_LBL;
    private javax.swing.JLabel nameLBL;
    private javax.swing.JTextField optionA_TF;
    private javax.swing.JTextField optionB_TF;
    private javax.swing.JTextField optionC_TF;
    private javax.swing.JTextField optionD_TF;
    private javax.swing.JLabel picture_LBL;
    private javax.swing.JTextField question_TF;
    private javax.swing.JTextField slNo_TF;
    private javax.swing.JComboBox subject_CB;
    // End of variables declaration//GEN-END:variables
}
