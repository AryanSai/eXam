/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_student;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author XII Info
 */
public class DB_Connection {
    Connection con;
  public Connection DB_Connection() throws SQLException{
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           
            con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "sairam");
        return con;
        }
}   
        
        

  
        
        
     

