/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
import java.sql.Statement;
import javax.swing.JOptionPane;
public class DBDelete {
    Statement stmt;
     public void deleteStudent(String SID){
        
        try {
            
            String sid = SID;
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM satudent WHERE sid='"+sid+"' ");
            
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }
   
    }
public void deleteBook(String BID){
        
        try {
            
            String bid = BID;
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM book WHERE bid='"+bid+"' ");
            
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }
}
        public void deleteBookOut(String bID){
        
        try {
            
            String bid = bID;
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM bookout WHERE bid='"+bid+"' ");
            
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (Exception e) {
        }
   
    }
   
}
