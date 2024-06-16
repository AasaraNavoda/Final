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
public class StudentController {
    public static void Form(String sid, String sname, String classs, String adress, String phonenumber) {
new model.AddRecord().Form(sid, sname, classs, adress, phonenumber);
JOptionPane.showMessageDialog(null, "New Record hasbeen inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
}

    public static void Form(String text, String text0, String text3,String classs, String text2, String text1 ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
