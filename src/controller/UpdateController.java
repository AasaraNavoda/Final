/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author user
 */
import model.UpdateForm;
import javax.swing.JOptionPane;
public class UpdateController {
     public static void updateStudent(String sid, String sname , String classs , String adress , String phonenumber){
        
        new UpdateForm().updateForm(sid, sname, classs, adress, phonenumber);
        
        if(sid.equals("")){
            
          
        }
        else{
            
            JOptionPane.showMessageDialog(null, "record has Updated Successfully ","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
      public static void updateBook(String bid, String bname , String aname , String Category ){
        
        new UpdateForm().updateForm1(bid, bname, aname, Category);
        
        if(bid.equals("")){
            
          
        }
        else{
            
            JOptionPane.showMessageDialog(null, "record has Updated Successfully ","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
      public static void updateBookOut(String bid, String sid , String bdate , String rdate ){
        
        new UpdateForm().updateForm2(bid, sid, bdate, rdate);
        
        if(bid.equals("")){
            
          
        }
        else{
            
            JOptionPane.showMessageDialog(null, "record has Updated Successfully ","Successfull",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    
}
