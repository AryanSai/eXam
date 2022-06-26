/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XII Info
 */
public class DBConnection {
    Connection con;
  public Connection DB_Connection() throws SQLException{
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateQuestionPaper.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            con = DriverManager.getConnection("jdbc:mysql://192.168.1.48/exam", "root", "sairam");
        return con;
        }
}   
        
        

  
        
        
     

