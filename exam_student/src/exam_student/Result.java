/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_student;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;

/**
 *
 * @author XII Info
 */
public class Result extends javax.swing.JFrame {

    ResultSet rs;
    DB_Connection d = new DB_Connection();
    Connection con;
    int j, numOfQuestionsAttempted, correctAnswers, marks, questionId[], numOfQuestions, studentId;
    String questionPaperId, clas, subject, name, correctPassword, enteredPassword = null;
    PreparedStatement ps, ps2;
    String[] answeredOptions, question, correctAns, answer, optionA, optionB, optionC, optionD;

    public Result(String questionPaperId, int questionId[], String answerOptions[], int num, int studentId, String clas, String subject, String name, String[] qstn, String[] ans, String[] A, String[] B, String[] C, String[] D) throws SQLException {
        initComponents();

        con = d.DB_Connection();

        this.subject = subject;
        this.questionId = questionId;
        this.questionPaperId = questionPaperId;
        this.numOfQuestions = num;
        this.studentId = studentId;
        this.clas = clas;
        this.name = name;
        this.question = qstn;
        this.answer = ans;
        this.answeredOptions = answerOptions;
        optionA = A;
        optionB = B;
        optionC = C;
        optionD = D;

        correctAns = new String[this.numOfQuestions];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalQuestions_TF = new javax.swing.JTextField();
        yotalQuestionsAttempted_TF = new javax.swing.JTextField();
        totalQuestionsNotAttempted_TF = new javax.swing.JTextField();
        totalMarks_TF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        correctAnswers_TF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        wrongAnswers_TF = new javax.swing.JTextField();
        logout_BTN = new javax.swing.JButton();
        generateAnsSheet_BTN = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Your Result");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("No. of Questions Attempted.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("No.of Questions not Attempted.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total No.of Questions.");

        totalQuestions_TF.setEditable(false);
        totalQuestions_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalQuestions_TFActionPerformed(evt);
            }
        });

        yotalQuestionsAttempted_TF.setEditable(false);

        totalQuestionsNotAttempted_TF.setEditable(false);

        totalMarks_TF.setEditable(false);
        totalMarks_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalMarks_TFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Your Total Marks are");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("No.of Correct Answers.");

        correctAnswers_TF.setEditable(false);
        correctAnswers_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnswers_TFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("No.of Wrong Answers.");

        wrongAnswers_TF.setEditable(false);

        logout_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logout_BTN.setText("LOGOUT");
        logout_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_BTNActionPerformed(evt);
            }
        });

        generateAnsSheet_BTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generateAnsSheet_BTN.setText("Answer Sheet");
        generateAnsSheet_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAnsSheet_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 265, Short.MAX_VALUE)
                        .addComponent(generateAnsSheet_BTN)
                        .addGap(252, 252, 252))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logout_BTN)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalQuestionsNotAttempted_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(totalQuestions_TF)
                                        .addComponent(yotalQuestionsAttempted_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correctAnswers_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wrongAnswers_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalMarks_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {correctAnswers_TF, totalMarks_TF, totalQuestionsNotAttempted_TF, totalQuestions_TF, wrongAnswers_TF, yotalQuestionsAttempted_TF});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_BTN))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalQuestions_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wrongAnswers_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yotalQuestionsAttempted_TF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalQuestionsNotAttempted_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correctAnswers_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalMarks_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(generateAnsSheet_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {correctAnswers_TF, totalMarks_TF, totalQuestionsNotAttempted_TF, totalQuestions_TF, wrongAnswers_TF, yotalQuestionsAttempted_TF});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void totalQuestions_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalQuestions_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalQuestions_TFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            totalMarks_TF.requestFocus();
            ps = con.prepareStatement("select * from questionpaperdetails where questionpaperId=?");
            ps.setString(1, questionPaperId);
            rs = ps.executeQuery();
            if (rs.next()) {
                correctPassword = (rs.getString("answerSheetPassword"));
            }
            //retriving the correct answers:
            for (j = 0; j < numOfQuestions; j++) {
                ps = con.prepareStatement("Select studentanswers.QuestionID, questionbank.AnswerOption from  questionbank  right join  studentanswers on  studentanswers.QuestionID=questionbank.QuestionID where studentid=? and questionbank.questionID=?");
                ps.setString(1, studentId + "");
                ps.setString(2, questionId[j] + "");
                rs = ps.executeQuery();
                if (rs.next()) {
                    correctAns[j] = (rs.getString("AnswerOption"));
                }

                //checking the correct answers and alloting marks:
                if (answeredOptions[j].equals(correctAns[j])) {
                    correctAnswers++;
                    marks++;
                }
            }
            //for displaying numOfQuestionsAttempted
            ps = con.prepareStatement("select count(AnswerOption) from studentanswers where AnswerOption != 'E' and QuestionPaperID=?");
            ps.setString(1, questionPaperId);
            rs = ps.executeQuery();
            if (rs.next()) {
                numOfQuestionsAttempted = (rs.getInt("count(AnswerOption)"));
            }

            //setting the final output here:
            totalQuestions_TF.setText(Integer.toString(numOfQuestions));
            yotalQuestionsAttempted_TF.setText(Integer.toString(numOfQuestionsAttempted));
            totalQuestionsNotAttempted_TF.setText(Integer.toString(numOfQuestions - numOfQuestionsAttempted));
            correctAnswers_TF.setText(Integer.toString(correctAnswers));
            totalMarks_TF.setText(Integer.toString(marks));
            wrongAnswers_TF.setText(Integer.toString(numOfQuestions - correctAnswers));

            //calling method for inserting total marks:
            storeanswers();
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    public void storeanswers() throws SQLException {
        ps2 = con.prepareStatement("insert into studentmarks values(?,?,?)");
        ps2.setInt(1, studentId);
        ps2.setString(2, questionPaperId);
        ps2.setString(3, marks + "");
        ps2.executeUpdate();
    }

    private void logout_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_BTNActionPerformed
        try {
            Student_Login s = new Student_Login();
            s.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_logout_BTNActionPerformed

    private void correctAnswers_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnswers_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnswers_TFActionPerformed

    private void totalMarks_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalMarks_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalMarks_TFActionPerformed

    private void generateAnsSheet_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateAnsSheet_BTNActionPerformed

        enteredPassword = (String) JOptionPane.showInputDialog(enteredPassword);
        if (enteredPassword.equals(correctPassword)) {
            String ans = null;
            try {
                HSSFWorkbook wb = new HSSFWorkbook();
                HSSFSheet answerSheet = wb.createSheet();
                wb.setSheetName(0, studentId + "");

                HSSFRow row;
                HSSFCell cell;

                CellStyle styleB = wb.createCellStyle();//Create style
                Font font = wb.createFont();//Create font
                font.setBoldweight(Font.BOLDWEIGHT_BOLD);//Make font bold
                styleB.setFont(font);//set it to bold

                row = answerSheet.createRow(1);
                cell = row.createCell(1);
                cell.setCellStyle(styleB);
                cell.setCellValue("Sri Satya Sai Higher Secondary School");

                row = answerSheet.createRow(2);
                cell = row.createCell(1);
                cell.setCellStyle(styleB);
                cell.setCellValue("Online Exam");

                row = answerSheet.createRow(3);
                cell = row.createCell(1);
                cell.setCellStyle(styleB);
                cell.setCellValue("Name of examination");
                cell = row.createCell(2);
                cell.setCellValue(questionPaperId);

                //                row = answerSheet.createRow(4);
                row = answerSheet.createRow(5);
                cell = row.createCell(1);
                cell.setCellStyle(styleB);
                cell.setCellValue("Name:");
                cell = row.createCell(2);
                cell.setCellValue(name);

                row = answerSheet.createRow(6);
                cell = row.createCell(1);
                cell.setCellValue("Class:");
                cell = row.createCell(2);
                cell.setCellValue(clas);

                row = answerSheet.createRow(7);
                cell = row.createCell(1);
                cell.setCellValue("Subject");
                cell = row.createCell(2);
                cell.setCellValue(subject);

                row = answerSheet.createRow(8);
                cell = row.createCell(1);
                cell.setCellValue("Roll No");
                cell = row.createCell(2);
                cell.setCellValue(studentId);

                row = answerSheet.createRow(9);
                cell = row.createCell(1);
                cell.setCellValue("Total Questions in the exam:");
                cell = row.createCell(2);
                cell.setCellValue(totalQuestions_TF.getText());

                //row = answerSheet.createRow(10);
                row = answerSheet.createRow(11);
                cell = row.createCell(1);
                cell.setCellStyle(styleB);
                cell.setCellValue("Number of Questions Attempted:");
                cell = row.createCell(2);
                cell.setCellValue(yotalQuestionsAttempted_TF.getText());

                row = answerSheet.createRow(12);
                cell = row.createCell(1);
                cell.setCellValue("Number of Questions not attempted:");
                cell = row.createCell(2);
                cell.setCellValue(totalQuestionsNotAttempted_TF.getText());

                row = answerSheet.createRow(13);
                cell = row.createCell(1);
                cell.setCellValue("Number of Correct answers:");
                cell = row.createCell(2);
                cell.setCellValue(correctAnswers_TF.getText());

                row = answerSheet.createRow(14);
                cell = row.createCell(1);
                cell.setCellValue("Number of Incorrect answers:");
                cell = row.createCell(2);
                cell.setCellValue(wrongAnswers_TF.getText());

                row = answerSheet.createRow(15);
                cell = row.createCell(1);
                cell.setCellValue("Total Marks:");
                cell = row.createCell(2);
                cell.setCellValue(totalMarks_TF.getText());

                row = answerSheet.createRow(17);
                cell = row.createCell(0);
                cell.setCellStyle(styleB);
                cell.setCellValue("Question No:");
                cell = row.createCell(1);
                cell.setCellStyle(styleB);
                cell.setCellValue("Question:");
                cell = row.createCell(2);
                cell.setCellStyle(styleB);
                cell.setCellValue("Your Answer:");
                cell = row.createCell(3);
                cell.setCellStyle(styleB);
                cell.setCellValue("Correct Answer:");

                for (int i = 0; i < numOfQuestions; i++) {
                    row = answerSheet.createRow(18 + i);
                    cell = row.createCell(0);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1);
                    cell.setCellValue(question[i]);

                    cell = row.createCell(2);
                    cell.setCellValue(answer[i]);

                    switch (correctAns[i]) {
                        case "A":
                            ans = optionA[i];
                            break;
                        case "B":
                            ans = optionB[i];
                            break;
                        case "C":
                            ans = optionC[i];
                            break;
                        case "D":
                            ans = optionD[i];
                            break;
                        case "E":
                            break;
                    }

                    cell = row.createCell(3);
                    cell.setCellValue(ans);

                }

                String userHomeFolder = System.getProperty("user.home");
                File dir = new File(userHomeFolder + "/Desktop/AnswerSheets");
                dir.mkdir();
            //System.out.println(dir);
                //new File(userHomeFolder).mkdirs();
                File file = new File(dir, studentId + ".xls");
                FileOutputStream fOut = new FileOutputStream(file);
                wb.write(fOut);
                fOut.flush();

                //JOptionPane.showMessageDialog(this, "File Created");
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            } catch (IOException ex) {
                Logger.getLogger(Result.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Password entered!!!");
        }

    }//GEN-LAST:event_generateAnsSheet_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField correctAnswers_TF;
    private javax.swing.JButton generateAnsSheet_BTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton logout_BTN;
    private javax.swing.JTextField totalMarks_TF;
    private javax.swing.JTextField totalQuestionsNotAttempted_TF;
    private javax.swing.JTextField totalQuestions_TF;
    private javax.swing.JTextField wrongAnswers_TF;
    private javax.swing.JTextField yotalQuestionsAttempted_TF;
    // End of variables declaration//GEN-END:variables
}
