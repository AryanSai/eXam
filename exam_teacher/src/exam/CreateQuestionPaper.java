package exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CreateQuestionPaper extends javax.swing.JFrame {

    String type, set, teacherId, name;
    String[] clas;
    String selectedSubject, selectedClass;
    DBConnection d = new DBConnection();
    Connection con;
    String questionPaperId;
    PreparedStatement ps;

    public CreateQuestionPaper(String TeacherId, String[] clas, String name) throws SQLException {
        initComponents();
        this.clas = clas;
        this.name = name;
        this.teacherId = TeacherId;
        con = d.DB_Connection();
        for (String i : clas) {
            if (i == null) {
                break;
            }
            Class_CB.addItem(i);
        }
        selectedSubject = (String) Subject_CB.getSelectedItem();
        QuestionPaperId_TF.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Class_CB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Subject_CB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Time_TF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NoQuestions_TF = new javax.swing.JTextField();
        PrepareQuestionPaper_BTN = new javax.swing.JButton();
        Back_BTN = new javax.swing.JButton();
        QuestionPaperIdLBL = new javax.swing.JLabel();
        QuestionPaperId_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Password_TF = new javax.swing.JTextField();
        nameLBL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        answerSheetPassword_TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Class_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Class_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_CBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Define Question Paper");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Class");

        Subject_CB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Subject_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subject_CBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Subject");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Time");

        Time_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time_TF.setToolTipText("Please enter in minutes");
        Time_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time_TFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("No.of questions");

        NoQuestions_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        PrepareQuestionPaper_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PrepareQuestionPaper_BTN.setText("PROCEED");
        PrepareQuestionPaper_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrepareQuestionPaper_BTNActionPerformed(evt);
            }
        });

        Back_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Back_BTN.setText("Back");
        Back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BTNActionPerformed(evt);
            }
        });

        QuestionPaperIdLBL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuestionPaperIdLBL.setText("Q.Paper.ID");

        QuestionPaperId_TF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuestionPaperId_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionPaperId_TFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Question Paper Password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Anwer Sheet Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(QuestionPaperIdLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuestionPaperId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Subject_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(682, Short.MAX_VALUE)
                        .addComponent(Back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Time_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(NoQuestions_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answerSheetPassword_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(PrepareQuestionPaper_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Class_CB, NoQuestions_TF, Password_TF, PrepareQuestionPaper_BTN, Subject_CB, Time_TF, answerSheetPassword_TF});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Subject_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionPaperId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuestionPaperIdLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NoQuestions_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Password_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Time_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(answerSheetPassword_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 37, Short.MAX_VALUE)
                .addComponent(PrepareQuestionPaper_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Back_BTN, Class_CB, NoQuestions_TF, Password_TF, PrepareQuestionPaper_BTN, QuestionPaperId_TF, Subject_CB, Time_TF, answerSheetPassword_TF, jLabel4, jLabel5, jLabel8, jLabel9});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Class_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_CBActionPerformed
        Subject_CB.removeAllItems();

        try {
            selectedClass = (String) Class_CB.getSelectedItem();
            ps = con.prepareStatement("Select distinct subject from teachersubject where TeacherID=? and Class=?");
            ps.setString(1, teacherId);
            ps.setString(2, selectedClass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Subject_CB.addItem(rs.getString("subject"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Class_CBActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Subject_CB.setVisible(true);
        jLabel3.setVisible(true);
        nameLBL.setText(name);
    }//GEN-LAST:event_formWindowOpened

    private void Back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BTNActionPerformed
        try {
            Home m = new Home(teacherId);
            this.dispose();
            m.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Back_BTNActionPerformed

    private void PrepareQuestionPaper_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrepareQuestionPaper_BTNActionPerformed
        questionPaperId = QuestionPaperId_TF.getText();
        int Duration = Integer.parseInt(Time_TF.getText());
        int NoOfQuestions = Integer.parseInt(NoQuestions_TF.getText());
        String Password = Password_TF.getText();
        String answerSheetPassword = answerSheetPassword_TF.getText();

        selectedClass = (String) Class_CB.getSelectedItem();
        selectedSubject = (String) Subject_CB.getSelectedItem();
        if (questionPaperId.isEmpty() || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the requirements!!!");
        } else {
            try {
                ps = con.prepareStatement("Insert into questionpaperdetails(QuestionPaperId ,Class,Subject,Duration,NoOfQuestions,TeacherID,Password,AnswerSheetPassword) values(?,?,?,?,?,?,?,?)");
                ps.setString(1, questionPaperId);
                ps.setString(2, selectedClass);
                ps.setString(3, selectedSubject);
                ps.setInt(4, Duration * 60);
                ps.setInt(5, NoOfQuestions);
                ps.setString(6, teacherId);
                ps.setString(7, Password);
                ps.setString(8, answerSheetPassword);
                ps.executeUpdate();
                SelectQuestions p = new SelectQuestions(teacherId, selectedSubject, selectedClass, questionPaperId, NoOfQuestions, clas, name);
                this.dispose();
                p.setVisible(true);

            } catch (Exception ex) {
                Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
                if (ex.getMessage().contains("Duplicate entry")) {
                    JOptionPane.showMessageDialog(this, "Please change the question paper id");
                } else {
                    JOptionPane.showMessageDialog(this, "Something Is Wrong");
                }
            }

        }
    }//GEN-LAST:event_PrepareQuestionPaper_BTNActionPerformed

    private void Subject_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subject_CBActionPerformed


    }//GEN-LAST:event_Subject_CBActionPerformed

    private void QuestionPaperId_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionPaperId_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionPaperId_TFActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            con.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EditChapters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void Time_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time_TFActionPerformed
        PrepareQuestionPaper_BTN.doClick();
    }//GEN-LAST:event_Time_TFActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_BTN;
    private javax.swing.JComboBox Class_CB;
    private javax.swing.JTextField NoQuestions_TF;
    private javax.swing.JTextField Password_TF;
    private javax.swing.JButton PrepareQuestionPaper_BTN;
    private javax.swing.JLabel QuestionPaperIdLBL;
    private javax.swing.JTextField QuestionPaperId_TF;
    private javax.swing.JComboBox Subject_CB;
    private javax.swing.JTextField Time_TF;
    private javax.swing.JTextField answerSheetPassword_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nameLBL;
    // End of variables declaration//GEN-END:variables
}
