 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Main;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author sys-user
 */
public class MyApp {
    
    Connection con;
  
   public static Connection connectDb() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/BANK", "root", "shajubhai");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
   }
 
   
   
}