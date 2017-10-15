/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;
//import static MainConnexion.MainConnexion.mycon;
import java.sql.*;


/**
 *
 * @author RBS
 */
public class MyBdConnection {
    
    static String url="jdbc:mysql://localhost:3306/client";
    static String login="root";
    static String pwd="";
    Connection mycon;
    static MyBdConnection instanceBD;
    
    private MyBdConnection(){
        try{
            mycon=DriverManager.getConnection(url,login,pwd);
        System.out.println("connexion etablie");
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            
        }
        
    }
    
    public static MyBdConnection getInstanceBD(){
          if(instanceBD==null){
            instanceBD=new MyBdConnection();
          
        }
        return instanceBD;
    }
    public Connection getConnection(){
        return mycon;
    }
    
}
