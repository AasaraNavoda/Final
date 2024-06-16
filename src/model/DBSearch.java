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
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBSearch {
    Statement stmt;
ResultSet rs;
public ResultSet searchLogin(String usName) {
try {
stmt = DBConnection.getStatementConnection();
String name = usName;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where username='"+ name + "'");
} catch (Exception e) {
e.printStackTrace();
}
return rs;
}
public ResultSet searchStudents(){
try{
stmt = DBConnection.getStatementConnection();
rs = stmt.executeQuery("SELECT * FROM satudent");
}
catch(Exception e){
}
return rs;
}
public ResultSet searchBook(){
try{
stmt = DBConnection.getStatementConnection();
    String bid = null;
rs = stmt.executeQuery("SELECT * FROM book WHERE bid='"+bid+"' ");
}
catch(Exception e){
    Object ex = null;
    Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
}
return rs;
}
public ResultSet searchallBook(){
try{
stmt = DBConnection.getStatementConnection();
    String bid = null;
rs = stmt.executeQuery("SELECT * FROM book ");
}
catch(Exception e){
   
}
return rs;
}
public ResultSet searchBookOut(){
try{
stmt = DBConnection.getStatementConnection();
rs = stmt.executeQuery("SELECT * FROM bookout");
}
catch(Exception e){
}
return rs;
}

    public ResultSet searchpatient(String bid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet searchBook(String bid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
