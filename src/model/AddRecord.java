/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author user
 */
public class AddRecord {
    Statement stmt;
public void Form(String sid, String sname, String classs,String adress,String phonenumber) {
try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO satudent VALUES('"+sid+"', '"+sname+"','"+classs+"', '"+adress+"', '"+phonenumber+"')");
} catch (Exception e) {
e.printStackTrace();
}
}

    public void Form(String sid, String sname, String classs, String adress) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public void Form1(String bid, String bname, String aname,String Category) {
try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO book VALUES('"+bid+"', '"+bname+"','"+aname+"', '"+Category+"')");
} catch (Exception e) {
e.printStackTrace();
}
}

    //public void Form1(String bid, String bname, String aname, String Category) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
public void Form2(String bid, String sid, String bdate,String rdate) {
try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO bookout VALUES('"+bid+"', '"+sid+"','"+bdate+"', '"+rdate+"')");
} catch (Exception e) {
e.printStackTrace();
}
}    
}
