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
import model.DBDelete;
public class DeleteController {
     public static void deleteStudent(String SID){
        
        new DBDelete().deleteStudent(SID);
        
     
        
    }

    public static void deleteBook(String BID){
        
        new DBDelete().deleteBook(BID);


    
    
}
      public static void deleteBookOut(String bID){
        
        new DBDelete().deleteBookOut(bID);


    
    
}
}
