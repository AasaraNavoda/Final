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
import model.DBConnection;
import javax.swing.JOptionPane;
public class UpdateForm {
    Statement stmt;
    
    public void updateForm(String sid, String sname , String classs , String adress , String phonenumber){
        
        try {
            
           // Class.forName("com.mysql.cj.jdbc.Driver");
            
            String SID = sid;
            
            String SNAME = sname;
            String CLASSS = classs;
            String ADRESS = adress;
            String PNUMBER = phonenumber;
            
            stmt = DBConnection.getStatementConnection();
           
             
           stmt.executeUpdate("UPDATE satudent SET sname = '"+SNAME+"', classs ='"+CLASSS+"', adress='"+ADRESS+"', phonenumber='"+PNUMBER+"' WHERE sid = '"+SID+"' ");
           
          
            
            
        } catch (Exception e) {
        }
    
    }
     public void updateForm1(String bid, String bname,String aname, String Category){
    
    try {
            String BID = bid;
            String BNAME = bname;
            String ANAME = aname;
            String CATEGORY = Category;
            

        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("UPDATE book SET bname ='"+bname+"', aname ='"+aname+"' , Category='"+Category+"' WHERE bid='"+BID+"' ");
        
    
    } catch (Exception e) {
    }

     } 
  public void updateForm2(String bid, String sid,String bdate, String rdate){
    
    try {
            String bID = bid;
            String sUD = sid;
            String BDATE = bdate;
            String RDATE = rdate;
            

        stmt = DBConnection.getStatementConnection();
        
        stmt.executeUpdate("UPDATE bookout SET sid ='"+sid+"', bdate ='"+bdate+"' , rdate='"+rdate+"' WHERE bid='"+bID+"' ");
        
    
    } catch (Exception e) {
    }

     }   
}
