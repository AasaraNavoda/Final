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
import javax.swing.JOptionPane; 
public class BookOutsController {
     public static void Form2(String bid, String sid, String bdate, String rdate) {
new model.AddRecord().Form2(bid, sid, bdate, rdate);
JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
}

    public static void Form2(String text, String text0, String text1,String text2, String Category ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //public static void Form2(String text, String text0, String text1, String text2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}
