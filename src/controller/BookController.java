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
public class BookController {
    public static void Form1(String bid, String bname, String aname, String Category) {
new model.AddRecord().Form1(bid, bname, aname, Category);
JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
}

    public static void Form1(String text, String text0, String text1,String text2, String Category ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
